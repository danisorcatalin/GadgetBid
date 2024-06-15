package com.gadget.dto.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
//import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.*;

/**
 * KycVerifyResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-17T22:18:00.554+02:00[Europe/Bucharest]")
public class KycVerifyResponse   {
  @JsonProperty("sessionId")
  private String sessionId;

  @JsonProperty("redirectUrl")
  private String redirectUrl;

  public KycVerifyResponse sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  /**
   * Get sessionId
   * @return sessionId
  */
  //@ApiModelProperty(required = true, value = "")
  @NotNull


  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  public KycVerifyResponse redirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
    return this;
  }

  /**
   * Get redirectUrl
   * @return redirectUrl
  */
  //@ApiModelProperty(required = true, value = "")
  @NotNull


  public String getRedirectUrl() {
    return redirectUrl;
  }

  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KycVerifyResponse kycVerifyResponse = (KycVerifyResponse) o;
    return Objects.equals(this.sessionId, kycVerifyResponse.sessionId) &&
        Objects.equals(this.redirectUrl, kycVerifyResponse.redirectUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionId, redirectUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KycVerifyResponse {\n");
    
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
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

