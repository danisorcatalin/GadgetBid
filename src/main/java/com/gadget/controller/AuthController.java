package com.gadget.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.gadget.dto.auth.AuthSessionDto;
import com.gadget.dto.auth.LogInDto;
import com.gadget.dto.auth.RegisterDto;
import com.gadget.dto.auth.UpdatePasswordDto;
import com.gadget.dto.generated.ResetPasswordDto;
import com.gadget.services.AuthService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public AuthSessionDto login(@RequestBody @Valid LogInDto logInDto) {
        authService.validateUser(logInDto);
        return authService.login(logInDto.getEmail(), logInDto.getPassword());
    }

    @PostMapping("/register")
    public void register(@RequestBody @Valid RegisterDto registerDto) throws JsonProcessingException {
        authService.registerUser(registerDto);
    }

    @GetMapping("/email/confirm")
    public void confirmEmail(@Valid @RequestParam(value = "token") String token) {
        authService.confirmEmail(token);
    }

    @PostMapping("/resetPassword")
    public void resetPassword(@Valid @RequestBody ResetPasswordDto resetPasswordDto) throws JsonProcessingException {
        authService.resetPassword(resetPasswordDto);
    }

    @PostMapping("/updatePassword")
    public void updatePassword(@Valid @RequestBody UpdatePasswordDto updatePasswordDto) {
        authService.updatePassword(updatePasswordDto);
    }

}
