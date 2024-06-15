package com.gadget.dto.generated;

import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets VeriffDocumentType
 */
public enum VeriffDocumentType {
  
  PASSPORT("PASSPORT"),
  
  ID_CARD("ID_CARD"),
  
  DRIVERS_LICENSE("DRIVERS_LICENSE"),
  
  RESIDENCE_PERMIT("RESIDENCE_PERMIT"),
  
  OTHER("OTHER");

  private String value;

  VeriffDocumentType(String value) {
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
  public static VeriffDocumentType fromValue(String value) {
    for (VeriffDocumentType b : VeriffDocumentType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

