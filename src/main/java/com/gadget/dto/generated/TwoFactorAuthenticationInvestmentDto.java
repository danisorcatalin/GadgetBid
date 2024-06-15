package com.gadget.dto.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
//import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.*;

/**
 * TwoFactorAuthenticationInvestmentDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-17T22:18:00.554+02:00[Europe/Bucharest]")
public class TwoFactorAuthenticationInvestmentDto   {
  @JsonProperty("token")
  private String token;

  public TwoFactorAuthenticationInvestmentDto token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Get token
   * @return token
  */
  //@ApiModelProperty(required = true, value = "")
  @NotNull


  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TwoFactorAuthenticationInvestmentDto twoFactorAuthenticationInvestmentDto = (TwoFactorAuthenticationInvestmentDto) o;
    return Objects.equals(this.token, twoFactorAuthenticationInvestmentDto.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TwoFactorAuthenticationInvestmentDto {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

