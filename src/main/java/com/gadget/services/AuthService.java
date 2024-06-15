package com.gadget.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gadget.configuration.auth.JwtTokenUtil;
import com.gadget.configuration.auth.UserPrincipal;
import com.gadget.dao.entity.User;
import com.gadget.dao.entity.enums.OnboardStatus;
import com.gadget.dto.auth.*;
import com.gadget.dto.generated.ResetPasswordDto;
import com.gadget.exceptions.BadRequestException;
import com.gadget.exceptions.NotFoundException;
import com.gadget.exceptions.UnauthorizedException;
import com.gadget.util.BCryptUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Slf4j
@Transactional
public class AuthService {

    private final UserService userService;
    private final AuthenticationManager authenticationManager;
    private final JwtTokenUtil jwtTokenUtil;

    @Value("${security.jwt.expiration-time}")
    private Integer jwtExpirationTime;

    public AuthService(
            UserService userService,
            AuthenticationManager authenticationManager,
            JwtTokenUtil jwtTokenUtil
    ) {
        this.userService = userService;
        this.authenticationManager = authenticationManager;
        this.jwtTokenUtil = jwtTokenUtil;
    }

    public AuthSessionDto login(String email, String password) {
        Authentication authenticate = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(email, password));
        UserPrincipal userPrincipal = (UserPrincipal) authenticate.getPrincipal();

        String jwt = jwtTokenUtil.generateAccessToken(userPrincipal.getUser());
        return new AuthSessionDto(jwtExpirationTime.toString(), false, jwt);
    }

    public void registerUser(RegisterDto registerDto) throws JsonProcessingException {
        // create the user
        User user = userService.createUser(registerDto);
        String encodedJwt = generateUserIdEmailJwt(user.getEmail(), user.getId());
        log.info("REGISTER_USER_JWT : " + encodedJwt);
        // TODO send confirmation email
        // TODO return userDTO after we figure out what data to return
    }

    public void confirmEmail(String jwt) {
        if (jwt == null) {
            throw new BadRequestException("Missing token");
        }
        try {
            User user = getUserFromUserIdEmailJwt(jwt, "No user found to validate email");
            if (!user.isVerified()) {
                userService.markAsVerified(user);
                User accountManager = user.getAccountManager();
                // TODO - send account manager email
                // TODO - send user welcome email
                userService.updateOnboardStatusByUser(user, OnboardStatus.REGISTERED);
            } else {
                log.warn("User already verified");
            }
        } catch (Exception e) {
            log.error("Error while decoding JWT", e);
            throw new BadRequestException("Invalid token");
        }
    }

    public void resetPassword(ResetPasswordDto resetPasswordDto) throws JsonProcessingException {
        User user = userService.findByEmail(resetPasswordDto.getEmail());
        if (user == null) {
            throw new NotFoundException("Email not found");
        }
        String encodedJwt = generateUserIdEmailJwt(user.getEmail(), user.getId());
        log.info("RESET_PASS_JWT : " + encodedJwt);
        // TODO send reset password email
    }

    public void updatePassword(UpdatePasswordDto updatePasswordDto) {
        if (updatePasswordDto.getToken() == null) {
            throw new BadRequestException("Missing token");
        }
        if (!updatePasswordDto.getPassword().equals(updatePasswordDto.getPasswordConfirmation())) {
            throw new BadRequestException("Passwords do not match");
        }

        try {
            User user = getUserFromUserIdEmailJwt(updatePasswordDto.getToken(), "No user found to reset password");
            userService.updatePassword(user, updatePasswordDto.getPassword());
        } catch (Exception e) {
            log.error("Error while decoding JWT", e);
            throw new BadRequestException("Invalid token");
        }
    }

    private User getUserFromUserIdEmailJwt(String jwt, String errorMessage) throws JsonProcessingException {
        String base64UserData = jwtTokenUtil.decode(jwt);
        byte[] userDataBytes = Base64.decodeBase64(base64UserData.getBytes());
        String decodedUserData = new String(userDataBytes);

        UserConfirmationData userData = new ObjectMapper().readValue(decodedUserData, UserConfirmationData.class);
        if (userData == null || userData.getId() == null || userData.getEmail() == null) {
            throw new BadRequestException("Invalid token");
        }

        User user = userService.findByEmail(userData.getEmail());
        if (user == null) {
            throw new NotFoundException(errorMessage);
        }
        return user;
    }

    private String generateUserIdEmailJwt(String email, Long id) throws JsonProcessingException {
        UserConfirmationData userConfirmationData = new UserConfirmationData(email, id);
        String jsonString = new ObjectMapper().writeValueAsString(userConfirmationData);
        String base64EncodedJson = Base64.encodeBase64String(jsonString.getBytes());
        return jwtTokenUtil.encode(base64EncodedJson);
    }

    public User validateUser(LogInDto logInDto) {
        User user = userService.findByEmail(logInDto.getEmail());
        if (user == null) {
            throw new UnauthorizedException("Invalid email address!");
        }
        if (!BCryptUtil.compare(logInDto.getPassword(), user.getPassword())) {
            throw new BadRequestException("Invalid password!");
        }
        if (!user.isActive()) {
            throw new UnauthorizedException("Inactive account!");
        }
        if (!user.isVerified()) {
            throw new UnauthorizedException("Please confirm your email in order to login");
        }
        return user;
    }

}
