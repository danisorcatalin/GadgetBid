package com.gadget.dto.auth;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthSessionDto   {

  private String expiresIn;
  private Boolean isSecondFactorActive;
  private String accessToken;

}

