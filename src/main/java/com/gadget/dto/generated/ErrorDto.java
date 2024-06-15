package com.gadget.dto.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
//import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ErrorDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-17T22:18:00.554+02:00[Europe/Bucharest]")
public class ErrorDto   {
  @JsonProperty("statusCode")
  private BigDecimal statusCode;

  @JsonProperty("message")
  @Valid
  private List<String> message = new ArrayList<>();

  @JsonProperty("error")
  private String error;

  public ErrorDto statusCode(BigDecimal statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * Get statusCode
   * @return statusCode
  */
  //@ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(BigDecimal statusCode) {
    this.statusCode = statusCode;
  }

  public ErrorDto message(List<String> message) {
    this.message = message;
    return this;
  }

  public ErrorDto addMessageItem(String messageItem) {
    this.message.add(messageItem);
    return this;
  }

  /**
   * Get message
   * @return message
  */
  //@ApiModelProperty(required = true, value = "")
  @NotNull


  public List<String> getMessage() {
    return message;
  }

  public void setMessage(List<String> message) {
    this.message = message;
  }

  public ErrorDto error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
  */
  //@ApiModelProperty(required = true, value = "")
  @NotNull


  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDto errorDto = (ErrorDto) o;
    return Objects.equals(this.statusCode, errorDto.statusCode) &&
        Objects.equals(this.message, errorDto.message) &&
        Objects.equals(this.error, errorDto.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, message, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDto {\n");
    
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

