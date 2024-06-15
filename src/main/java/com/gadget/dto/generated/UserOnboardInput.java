package com.gadget.dto.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
//import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserOnboardInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-17T22:18:00.554+02:00[Europe/Bucharest]")
public class UserOnboardInput   {
  @JsonProperty("user")
  private UserOutputDto user;

  @JsonProperty("accountManager")
  private UserOutputDto accountManager;

  @JsonProperty("status")
  private UserOnboardStatus status;

  public UserOnboardInput user(UserOutputDto user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  */
  //@ApiModelProperty(value = "")

  @Valid

  public UserOutputDto getUser() {
    return user;
  }

  public void setUser(UserOutputDto user) {
    this.user = user;
  }

  public UserOnboardInput accountManager(UserOutputDto accountManager) {
    this.accountManager = accountManager;
    return this;
  }

  /**
   * Get accountManager
   * @return accountManager
  */
  //@ApiModelProperty(value = "")

  @Valid

  public UserOutputDto getAccountManager() {
    return accountManager;
  }

  public void setAccountManager(UserOutputDto accountManager) {
    this.accountManager = accountManager;
  }

  public UserOnboardInput status(UserOnboardStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  //@ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public UserOnboardStatus getStatus() {
    return status;
  }

  public void setStatus(UserOnboardStatus status) {
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
    UserOnboardInput userOnboardInput = (UserOnboardInput) o;
    return Objects.equals(this.user, userOnboardInput.user) &&
        Objects.equals(this.accountManager, userOnboardInput.accountManager) &&
        Objects.equals(this.status, userOnboardInput.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, accountManager, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserOnboardInput {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    accountManager: ").append(toIndentedString(accountManager)).append("\n");
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

