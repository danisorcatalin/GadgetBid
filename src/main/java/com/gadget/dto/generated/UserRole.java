package com.gadget.dto.generated;

import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets UserRole
 */
public enum UserRole {
  
  ADMIN("ADMIN"),
  
  ACCOUNT_MANAGER("ACCOUNT_MANAGER"),
  
  AUDITOR("AUDITOR"),
  
  ISSUER("ISSUER"),
  
  INVESTOR("INVESTOR"),
  
  USER("USER");

  private String value;

  UserRole(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static UserRole fromValue(String value) {
    for (UserRole b : UserRole.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

