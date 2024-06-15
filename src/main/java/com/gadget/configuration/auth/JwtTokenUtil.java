package com.gadget.configuration.auth;

import com.gadget.dao.entity.User;
import io.jsonwebtoken.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
@RequiredArgsConstructor
@Slf4j
public class JwtTokenUtil {

    @Value("${security.jwt.secret}")
    private String jwtSecret;

    @Value("${security.jwt.issuer}")
    private String jwtIssuer;

    @Value("${security.jwt.expiration-time}")
    private Integer jwtExpirationTime;

    public String generateAccessToken(User user) {
        return Jwts.builder()
                .setHeaderParam("typ", "JWT")
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + jwtExpirationTime * 1000))
                .addClaims(createClaims(user))
                .signWith(SignatureAlgorithm.HS256, jwtSecret)
                .compact();
    }

    public String encode(String payload) {
        return Jwts.builder()
                .setHeaderParam("typ", "JWT")
                .setPayload(payload)
                .signWith(SignatureAlgorithm.HS256, jwtSecret)
                .compact();
    }

    public String decode(String jwt) {
        return Jwts.parser()
                .setSigningKey(jwtSecret)
                .parse(jwt)
                .getBody().toString();
    }

    public String getEmail(String token) {
        Claims claims = Jwts.parser()
                .setSigningKey(jwtSecret)
                .parseClaimsJws(token)
                .getBody();
        Object email = claims.get("email");
        return email != null ? email.toString() : null;
    }

    public boolean validate(String token) {
        try {
            Jwts
                    .parser()
                    .setSigningKey(jwtSecret)
                    .parseClaimsJws(token);
            return true;
        } catch (SignatureException ex) {
            log.error("Invalid JWT signature - {}", ex.getMessage());
        } catch (MalformedJwtException ex) {
            log.error("Invalid JWT token - {}", ex.getMessage());
        } catch (ExpiredJwtException ex) {
            log.error("Expired JWT token - {}", ex.getMessage());
        } catch (UnsupportedJwtException ex) {
            log.error("Unsupported JWT token - {}", ex.getMessage());
        } catch (IllegalArgumentException ex) {
            log.error("JWT claims string is empty - {}", ex.getMessage());
        }
        return false;
    }

    private Map<String, Object> createClaims(User user) {
        Map<String, Object> claims = new HashMap<>();
        claims.put("id", user.getId());
        claims.put("role", user.getRole());
        claims.put("email", user.getEmail());
        claims.put("firstName", user.getFirstName());
        claims.put("lastName", user.getLastName());
        claims.put("twoFactorActivated", user.isTwoFactorActivated());
        claims.put("isSecondFactorAuthenticated", false);
        return claims;
    }

}
