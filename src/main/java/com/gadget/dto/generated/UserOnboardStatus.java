package com.gadget.dto.generated;

import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets UserOnboardStatus
 */
public enum UserOnboardStatus {
  
  OPEN("OPEN"),
  
  REGISTERED("REGISTERED"),
  
  NOT_VERIFIED("NOT_VERIFIED"),
  
  VERIFIED("VERIFIED"),
  
  KYC_KYB_AML("KYC_KYB_AML"),
  
  KYC_KYB_AML_OK("KYC_KYB_AML_OK"),
  
  REJECTED("REJECTED"),
  
  NOT_ELIGIBLE("NOT_ELIGIBLE");

  private String value;

  UserOnboardStatus(String value) {
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
  public static UserOnboardStatus fromValue(String value) {
    for (UserOnboardStatus b : UserOnboardStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

