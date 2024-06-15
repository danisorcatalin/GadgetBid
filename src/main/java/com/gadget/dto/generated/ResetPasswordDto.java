package com.gadget.dto.generated;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Data
public class ResetPasswordDto {

    @NotEmpty
    @Email
    private String email;

}

