package com.gadget.dto.user;

import com.gadget.annotation.PasswordValid;
import com.gadget.annotation.PhoneNumberValid;
import com.gadget.dao.entity.enums.Role;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class UserInputDto {

    @NotEmpty
    private String firstName;
    @NotEmpty
    private String lastName;
    @Email
    @NotEmpty
    private String email;
    @NotEmpty
    @PhoneNumberValid
    private String phone;
    @PasswordValid
    private String password;
    @NotNull
    private Role role;
}

