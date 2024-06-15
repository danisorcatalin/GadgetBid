package com.gadget.dto.auth;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class LogInDto {

    @Email
    @NotEmpty
    private String email;

    @Size(min = 8)
    @NotEmpty
    private String password;

}

