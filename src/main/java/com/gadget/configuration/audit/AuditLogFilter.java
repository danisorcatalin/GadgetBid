package com.gadget.configuration.audit;

import com.gadget.configuration.auth.UserPrincipal;
import com.gadget.dao.entity.Audit;
import com.gadget.dao.entity.User;
import com.gadget.services.AuditService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

// TODO huge table fix later?
@Component
@Slf4j
public class AuditLogFilter extends OncePerRequestFilter {

    private final AuditService auditService;

    public AuditLogFilter(AuditService auditService) {
        this.auditService = auditService;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest,
                                    HttpServletResponse httpServletResponse,
                                    FilterChain filterChain) throws IOException, ServletException {
        log.info("IN AUDIT LOG FILTER");
        if (httpServletRequest.getContentType() != null && httpServletRequest.getContentType().equals("application/json")) {
            SecurityContext securityContext = SecurityContextHolder.getContext();
            if (securityContext != null) {
                Authentication authentication = securityContext.getAuthentication();
                if (authentication != null && !(authentication instanceof AnonymousAuthenticationToken)) {
                    try {
                        UserPrincipal userPrincipal = (UserPrincipal) authentication.getPrincipal();
                        User user = userPrincipal.getUser();
                        createAuditEntry(user, httpServletRequest);
                    } catch (Exception e) {
                        log.error("Error while saving audit entry", e);
                    }
                }
            }
        }
        filterChain.doFilter(httpServletRequest, httpServletResponse);
    }

    private void createAuditEntry(User user, HttpServletRequest httpServletRequest) throws IOException {
        Audit audit = new Audit();
        audit.setCreatedAt(LocalDateTime.now());
        audit.setUser(user);
        audit.setMethod(httpServletRequest.getMethod());
        audit.setPayload(IOUtils.toString(httpServletRequest.getReader()));
        audit.setUrl(httpServletRequest.getRequestURI());
        auditService.createAudit(audit);
    }
}
