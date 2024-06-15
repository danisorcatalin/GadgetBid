package com.gadget.dto.generated;

import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets UserKycFileType
 */
public enum UserKycFileType {
  
  IDENTITY("IDENTITY"),
  
  PHOTO("PHOTO");

  private String value;

  UserKycFileType(String value) {
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
  public static UserKycFileType fromValue(String value) {
    for (UserKycFileType b : UserKycFileType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

