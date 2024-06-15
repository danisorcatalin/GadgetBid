package com.gadget.controller;

import com.gadget.configuration.auth.JwtTokenUtil;
import com.gadget.configuration.auth.UserPrincipal;
import com.gadget.dao.entity.User;
import com.gadget.dao.entity.enums.Role;
import com.gadget.dao.repository.*;
import com.gadget.dto.generated.TestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/hello")
public class TestController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuditRepository auditRepository;

    @Autowired
    private UserQuestionRepository userQuestionRepository;

    @Autowired
    private UserOnboardFileRepository userOnboardFileRepository;

    @Autowired
    private UserOnboardRepository userOnboardRepository;

    @Autowired
    private UserKycFileRepository userKycFileRepository;

    @Autowired
    private UserKycRepository userKycRepository;

    @Autowired
    private UserAnswerRepository userAnswerRepository;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @GetMapping
    public TestDTO test() {
        userRepository.findAll();

        User user = new User();
        user.setFirstName("abc");
        user.setLastName("abc");
        user.setEmail("abc");
        user.setPhone("abc");
        user.setPassword("abc");
        user.setRole(Role.ACCOUNT_MANAGER.toString());
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());
        userRepository.save(user);


        TestDTO testDTO = new TestDTO();
        testDTO.setMessage("abc");
        return testDTO;
    }

    @GetMapping("user")
    public String helloUser() {
        return "Hello User";
    }

    @GetMapping("admin")
    public String helloAdmin() {
        return "Hello Admin";
    }

    @GetMapping("login")
    public String login() {
        String email = "a";
        String pass = "b";
        Authentication authenticate = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(email, pass));

        UserPrincipal userPrincipal = (UserPrincipal) authenticate.getPrincipal();

        return jwtTokenUtil.generateAccessToken(userPrincipal.getUser());
    }

}
