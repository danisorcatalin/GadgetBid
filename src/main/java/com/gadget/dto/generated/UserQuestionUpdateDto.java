package com.gadget.dto.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
//import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserQuestionUpdateDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-17T22:18:00.554+02:00[Europe/Bucharest]")
public class UserQuestionUpdateDto   {
  @JsonProperty("id")
  private BigDecimal id;

  @JsonProperty("question")
  private String question;

  @JsonProperty("variant1")
  private String variant1;

  @JsonProperty("variant2")
  private String variant2;

  @JsonProperty("variant3")
  private String variant3;

  @JsonProperty("correctVariant")
  private BigDecimal correctVariant;

  @JsonProperty("order")
  private BigDecimal order;

  @JsonProperty("active")
  private BigDecimal active;

  public UserQuestionUpdateDto id(BigDecimal id) {
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

  public UserQuestionUpdateDto question(String question) {
    this.question = question;
    return this;
  }

  /**
   * Get question
   * @return question
  */
  //@ApiModelProperty(required = true, value = "")
  @NotNull


  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public UserQuestionUpdateDto variant1(String variant1) {
    this.variant1 = variant1;
    return this;
  }

  /**
   * Get variant1
   * @return variant1
  */
  //@ApiModelProperty(required = true, value = "")
  @NotNull


  public String getVariant1() {
    return variant1;
  }

  public void setVariant1(String variant1) {
    this.variant1 = variant1;
  }

  public UserQuestionUpdateDto variant2(String variant2) {
    this.variant2 = variant2;
    return this;
  }

  /**
   * Get variant2
   * @return variant2
  */
  //@ApiModelProperty(required = true, value = "")
  @NotNull


  public String getVariant2() {
    return variant2;
  }

  public void setVariant2(String variant2) {
    this.variant2 = variant2;
  }

  public UserQuestionUpdateDto variant3(String variant3) {
    this.variant3 = variant3;
    return this;
  }

  /**
   * Get variant3
   * @return variant3
  */
  //@ApiModelProperty(required = true, value = "")
  @NotNull


  public String getVariant3() {
    return variant3;
  }

  public void setVariant3(String variant3) {
    this.variant3 = variant3;
  }

  public UserQuestionUpdateDto correctVariant(BigDecimal correctVariant) {
    this.correctVariant = correctVariant;
    return this;
  }

  /**
   * Get correctVariant
   * @return correctVariant
  */
  //@ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getCorrectVariant() {
    return correctVariant;
  }

  public void setCorrectVariant(BigDecimal correctVariant) {
    this.correctVariant = correctVariant;
  }

  public UserQuestionUpdateDto order(BigDecimal order) {
    this.order = order;
    return this;
  }

  /**
   * Get order
   * @return order
  */
  //@ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getOrder() {
    return order;
  }

  public void setOrder(BigDecimal order) {
    this.order = order;
  }

  public UserQuestionUpdateDto active(BigDecimal active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
  */
  //@ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getActive() {
    return active;
  }

  public void setActive(BigDecimal active) {
    this.active = active;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserQuestionUpdateDto userQuestionUpdateDto = (UserQuestionUpdateDto) o;
    return Objects.equals(this.id, userQuestionUpdateDto.id) &&
        Objects.equals(this.question, userQuestionUpdateDto.question) &&
        Objects.equals(this.variant1, userQuestionUpdateDto.variant1) &&
        Objects.equals(this.variant2, userQuestionUpdateDto.variant2) &&
        Objects.equals(this.variant3, userQuestionUpdateDto.variant3) &&
        Objects.equals(this.correctVariant, userQuestionUpdateDto.correctVariant) &&
        Objects.equals(this.order, userQuestionUpdateDto.order) &&
        Objects.equals(this.active, userQuestionUpdateDto.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, question, variant1, variant2, variant3, correctVariant, order, active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserQuestionUpdateDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
    sb.append("    variant1: ").append(toIndentedString(variant1)).append("\n");
    sb.append("    variant2: ").append(toIndentedString(variant2)).append("\n");
    sb.append("    variant3: ").append(toIndentedString(variant3)).append("\n");
    sb.append("    correctVariant: ").append(toIndentedString(correctVariant)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

