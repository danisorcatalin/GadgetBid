package com.gadget.dto.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
//import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.*;

/**
 * CronInputDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-17T22:18:00.554+02:00[Europe/Bucharest]")
public class CronInputDto   {
  @JsonProperty("secret")
  private String secret;

  @JsonProperty("service")
  private String service;

  public CronInputDto secret(String secret) {
    this.secret = secret;
    return this;
  }

  /**
   * Get secret
   * @return secret
  */
  //@ApiModelProperty(required = true, value = "")
  @NotNull


  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }

  public CronInputDto service(String service) {
    this.service = service;
    return this;
  }

  /**
   * Get service
   * @return service
  */
  //@ApiModelProperty(required = true, value = "")
  @NotNull


  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CronInputDto cronInputDto = (CronInputDto) o;
    return Objects.equals(this.secret, cronInputDto.secret) &&
        Objects.equals(this.service, cronInputDto.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secret, service);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CronInputDto {\n");
    
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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

