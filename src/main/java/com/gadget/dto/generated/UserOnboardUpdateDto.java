package com.gadget.dto.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
//import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.Valid;

/**
 * UserOnboardUpdateDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-17T22:18:00.554+02:00[Europe/Bucharest]")
public class UserOnboardUpdateDto   {
  @JsonProperty("accountManagerId")
  private BigDecimal accountManagerId;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    OPEN("OPEN"),
    
    REGISTERED("REGISTERED"),
    
    NOT_VERIFIED("NOT_VERIFIED"),
    
    VERIFIED("VERIFIED"),
    
    KYC_KYB_AML("KYC_KYB_AML"),
    
    KYC_KYB_AML_OK("KYC_KYB_AML_OK"),
    
    REJECTED("REJECTED"),
    
    NOT_ELIGIBLE("NOT_ELIGIBLE");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  public UserOnboardUpdateDto accountManagerId(BigDecimal accountManagerId) {
    this.accountManagerId = accountManagerId;
    return this;
  }

  /**
   * Get accountManagerId
   * @return accountManagerId
  */
  //@ApiModelProperty(value = "")

  @Valid

  public BigDecimal getAccountManagerId() {
    return accountManagerId;
  }

  public void setAccountManagerId(BigDecimal accountManagerId) {
    this.accountManagerId = accountManagerId;
  }

  public UserOnboardUpdateDto status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  //@ApiModelProperty(value = "")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserOnboardUpdateDto userOnboardUpdateDto = (UserOnboardUpdateDto) o;
    return Objects.equals(this.accountManagerId, userOnboardUpdateDto.accountManagerId) &&
        Objects.equals(this.status, userOnboardUpdateDto.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountManagerId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserOnboardUpdateDto {\n");
    
    sb.append("    accountManagerId: ").append(toIndentedString(accountManagerId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

