package com.gadget.dto.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
//import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserOnboardOutputDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-17T22:18:00.554+02:00[Europe/Bucharest]")
public class UserOnboardOutputDto   {
  @JsonProperty("id")
  private BigDecimal id;

  @JsonProperty("user")
  private UserOutputDto user;

  @JsonProperty("files")
  @Valid
  private List<UserOnboardFileOutputDto> files = new ArrayList<>();

  @JsonProperty("accountManager")
  private UserOutputDto accountManager;

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

  @JsonProperty("createdAt")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @JsonProperty("updatedAt")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updatedAt;

  public UserOnboardOutputDto id(BigDecimal id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  //@ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public UserOnboardOutputDto user(UserOutputDto user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  */
  //@ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public UserOutputDto getUser() {
    return user;
  }

  public void setUser(UserOutputDto user) {
    this.user = user;
  }

  public UserOnboardOutputDto files(List<UserOnboardFileOutputDto> files) {
    this.files = files;
    return this;
  }

  public UserOnboardOutputDto addFilesItem(UserOnboardFileOutputDto filesItem) {
    this.files.add(filesItem);
    return this;
  }

  /**
   * Get files
   * @return files
  */
  //@ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<UserOnboardFileOutputDto> getFiles() {
    return files;
  }

  public void setFiles(List<UserOnboardFileOutputDto> files) {
    this.files = files;
  }

  public UserOnboardOutputDto accountManager(UserOutputDto accountManager) {
    this.accountManager = accountManager;
    return this;
  }

  /**
   * Get accountManager
   * @return accountManager
  */
  //@ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public UserOutputDto getAccountManager() {
    return accountManager;
  }

  public void setAccountManager(UserOutputDto accountManager) {
    this.accountManager = accountManager;
  }

  public UserOnboardOutputDto status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  //@ApiModelProperty(required = true, value = "")
  @NotNull


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public UserOnboardOutputDto createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  //@ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public UserOnboardOutputDto updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  */
  //@ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserOnboardOutputDto userOnboardOutputDto = (UserOnboardOutputDto) o;
    return Objects.equals(this.id, userOnboardOutputDto.id) &&
        Objects.equals(this.user, userOnboardOutputDto.user) &&
        Objects.equals(this.files, userOnboardOutputDto.files) &&
        Objects.equals(this.accountManager, userOnboardOutputDto.accountManager) &&
        Objects.equals(this.status, userOnboardOutputDto.status) &&
        Objects.equals(this.createdAt, userOnboardOutputDto.createdAt) &&
        Objects.equals(this.updatedAt, userOnboardOutputDto.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, user, files, accountManager, status, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserOnboardOutputDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    accountManager: ").append(toIndentedString(accountManager)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

