package com.gadget.dto.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
//import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.*;

/**
 * UpdateUserPasswordDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-17T22:18:00.554+02:00[Europe/Bucharest]")
public class UpdateUserPasswordDto   {
  @JsonProperty("currentPassword")
  private String currentPassword;

  @JsonProperty("newPassword")
  private String newPassword;

  @JsonProperty("newPasswordConfirmation")
  private String newPasswordConfirmation;

  public UpdateUserPasswordDto currentPassword(String currentPassword) {
    this.currentPassword = currentPassword;
    return this;
  }

  /**
   * Get currentPassword
   * @return currentPassword
  */
  //@ApiModelProperty(required = true, value = "")
  @NotNull


  public String getCurrentPassword() {
    return currentPassword;
  }

  public void setCurrentPassword(String currentPassword) {
    this.currentPassword = currentPassword;
  }

  public UpdateUserPasswordDto newPassword(String newPassword) {
    this.newPassword = newPassword;
    return this;
  }

  /**
   * Get newPassword
   * @return newPassword
  */
  //@ApiModelProperty(required = true, value = "")
  @NotNull


  public String getNewPassword() {
    return newPassword;
  }

  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }

  public UpdateUserPasswordDto newPasswordConfirmation(String newPasswordConfirmation) {
    this.newPasswordConfirmation = newPasswordConfirmation;
    return this;
  }

  /**
   * Get newPasswordConfirmation
   * @return newPasswordConfirmation
  */
  //@ApiModelProperty(required = true, value = "")
  @NotNull


  public String getNewPasswordConfirmation() {
    return newPasswordConfirmation;
  }

  public void setNewPasswordConfirmation(String newPasswordConfirmation) {
    this.newPasswordConfirmation = newPasswordConfirmation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserPasswordDto updateUserPasswordDto = (UpdateUserPasswordDto) o;
    return Objects.equals(this.currentPassword, updateUserPasswordDto.currentPassword) &&
        Objects.equals(this.newPassword, updateUserPasswordDto.newPassword) &&
        Objects.equals(this.newPasswordConfirmation, updateUserPasswordDto.newPasswordConfirmation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPassword, newPassword, newPasswordConfirmation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserPasswordDto {\n");
    
    sb.append("    currentPassword: ").append(toIndentedString(currentPassword)).append("\n");
    sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
    sb.append("    newPasswordConfirmation: ").append(toIndentedString(newPasswordConfirmation)).append("\n");
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

