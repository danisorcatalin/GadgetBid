package com.gadget.dto.auth;

import com.gadget.annotation.PasswordValid;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class UpdatePasswordDto   {

  @NotEmpty
  @Size(min = 8)
  @PasswordValid
  private String password;

  @NotEmpty
  private String passwordConfirmation;

  @NotEmpty
  private String token;

}

