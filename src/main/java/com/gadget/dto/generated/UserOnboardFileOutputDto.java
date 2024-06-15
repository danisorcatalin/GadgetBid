package com.gadget.dto.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
//import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserOnboardFileOutputDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-17T22:18:00.554+02:00[Europe/Bucharest]")
public class UserOnboardFileOutputDto   {
  @JsonProperty("id")
  private BigDecimal id;

  @JsonProperty("onboardId")
  private BigDecimal onboardId;

  @JsonProperty("userId")
  private BigDecimal userId;

  @JsonProperty("type")
  private UserOnboardFileType type;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("mimeType")
  private String mimeType;

  @JsonProperty("fileExtension")
  private String fileExtension;

  @JsonProperty("filePath")
  private String filePath;

  @JsonProperty("size")
  private BigDecimal size;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    NEW("NEW"),
    
    APPROVED("APPROVED"),
    
    DELETED("DELETED");

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

  public UserOnboardFileOutputDto id(BigDecimal id) {
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

  public UserOnboardFileOutputDto onboardId(BigDecimal onboardId) {
    this.onboardId = onboardId;
    return this;
  }

  /**
   * Get onboardId
   * @return onboardId
  */
  //@ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getOnboardId() {
    return onboardId;
  }

  public void setOnboardId(BigDecimal onboardId) {
    this.onboardId = onboardId;
  }

  public UserOnboardFileOutputDto userId(BigDecimal userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  //@ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getUserId() {
    return userId;
  }

  public void setUserId(BigDecimal userId) {
    this.userId = userId;
  }

  public UserOnboardFileOutputDto type(UserOnboardFileType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  //@ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public UserOnboardFileType getType() {
    return type;
  }

  public void setType(UserOnboardFileType type) {
    this.type = type;
  }

  public UserOnboardFileOutputDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  //@ApiModelProperty(required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserOnboardFileOutputDto description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  //@ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UserOnboardFileOutputDto mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  /**
   * Get mimeType
   * @return mimeType
  */
  //@ApiModelProperty(required = true, value = "")
  @NotNull


  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public UserOnboardFileOutputDto fileExtension(String fileExtension) {
    this.fileExtension = fileExtension;
    return this;
  }

  /**
   * Get fileExtension
   * @return fileExtension
  */
  //@ApiModelProperty(required = true, value = "")
  @NotNull


  public String getFileExtension() {
    return fileExtension;
  }

  public void setFileExtension(String fileExtension) {
    this.fileExtension = fileExtension;
  }

  public UserOnboardFileOutputDto filePath(String filePath) {
    this.filePath = filePath;
    return this;
  }

  /**
   * Get filePath
   * @return filePath
  */
  //@ApiModelProperty(required = true, value = "")
  @NotNull


  public String getFilePath() {
    return filePath;
  }

  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }

  public UserOnboardFileOutputDto size(BigDecimal size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  */
  //@ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getSize() {
    return size;
  }

  public void setSize(BigDecimal size) {
    this.size = size;
  }

  public UserOnboardFileOutputDto status(StatusEnum status) {
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

  public UserOnboardFileOutputDto createdAt(OffsetDateTime createdAt) {
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

  public UserOnboardFileOutputDto updatedAt(OffsetDateTime updatedAt) {
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
    UserOnboardFileOutputDto userOnboardFileOutputDto = (UserOnboardFileOutputDto) o;
    return Objects.equals(this.id, userOnboardFileOutputDto.id) &&
        Objects.equals(this.onboardId, userOnboardFileOutputDto.onboardId) &&
        Objects.equals(this.userId, userOnboardFileOutputDto.userId) &&
        Objects.equals(this.type, userOnboardFileOutputDto.type) &&
        Objects.equals(this.name, userOnboardFileOutputDto.name) &&
        Objects.equals(this.description, userOnboardFileOutputDto.description) &&
        Objects.equals(this.mimeType, userOnboardFileOutputDto.mimeType) &&
        Objects.equals(this.fileExtension, userOnboardFileOutputDto.fileExtension) &&
        Objects.equals(this.filePath, userOnboardFileOutputDto.filePath) &&
        Objects.equals(this.size, userOnboardFileOutputDto.size) &&
        Objects.equals(this.status, userOnboardFileOutputDto.status) &&
        Objects.equals(this.createdAt, userOnboardFileOutputDto.createdAt) &&
        Objects.equals(this.updatedAt, userOnboardFileOutputDto.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, onboardId, userId, type, name, description, mimeType, fileExtension, filePath, size, status, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserOnboardFileOutputDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    onboardId: ").append(toIndentedString(onboardId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    fileExtension: ").append(toIndentedString(fileExtension)).append("\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

