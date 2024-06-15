package com.gadget.dto.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
//import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserAnswerOutputDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-17T22:18:00.554+02:00[Europe/Bucharest]")
public class UserAnswerOutputDto   {
  @JsonProperty("id")
  private BigDecimal id;

  @JsonProperty("user")
  private UserOutputDto user;

  @JsonProperty("question")
  private UserQuestionDto question;

  @JsonProperty("answer")
  private String answer;

  @JsonProperty("createdAt")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  public UserAnswerOutputDto id(BigDecimal id) {
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

  public UserAnswerOutputDto user(UserOutputDto user) {
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

  public UserAnswerOutputDto question(UserQuestionDto question) {
    this.question = question;
    return this;
  }

  /**
   * Get question
   * @return question
  */
  //@ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public UserQuestionDto getQuestion() {
    return question;
  }

  public void setQuestion(UserQuestionDto question) {
    this.question = question;
  }

  public UserAnswerOutputDto answer(String answer) {
    this.answer = answer;
    return this;
  }

  /**
   * Get answer
   * @return answer
  */
  //@ApiModelProperty(required = true, value = "")
  @NotNull


  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }

  public UserAnswerOutputDto createdAt(OffsetDateTime createdAt) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAnswerOutputDto userAnswerOutputDto = (UserAnswerOutputDto) o;
    return Objects.equals(this.id, userAnswerOutputDto.id) &&
        Objects.equals(this.user, userAnswerOutputDto.user) &&
        Objects.equals(this.question, userAnswerOutputDto.question) &&
        Objects.equals(this.answer, userAnswerOutputDto.answer) &&
        Objects.equals(this.createdAt, userAnswerOutputDto.createdAt);
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

