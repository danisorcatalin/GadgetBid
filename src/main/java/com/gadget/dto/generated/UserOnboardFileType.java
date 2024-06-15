package com.gadget.dto.generated;

import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets UserOnboardFileType
 */
public enum UserOnboardFileType {
  
  IDENTITY("IDENTITY"),
  
  INVESTMENT_AGREEMENT("INVESTMENT_AGREEMENT"),
  
  INVESTMENT_AGREEMENT_SIGNED("INVESTMENT_AGREEMENT_SIGNED"),
  
  SPV_AGREEMENT("SPV_AGREEMENT"),
  
  SPV_AGREEMENT_SIGNED("SPV_AGREEMENT_SIGNED"),
  
  PROOF_OF_PAYMENT("PROOF_OF_PAYMENT"),
  
  CONTRACT("CONTRACT"),
  
  CONTRACT_SIGNED("CONTRACT_SIGNED"),
  
  EXECUTIVE_SUMMARY("EXECUTIVE_SUMMARY");

  private String value;

  UserOnboardFileType(String value) {
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
  public static UserOnboardFileType fromValue(String value) {
    for (UserOnboardFileType b : UserOnboardFileType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

