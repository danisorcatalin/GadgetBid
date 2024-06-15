package com.gadget.dto.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
//import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserAnswerInputDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-17T22:18:00.554+02:00[Europe/Bucharest]")
public class UserAnswerInputDto   {
  @JsonProperty("answer")
  private BigDecimal answer;

  @JsonProperty("question")
  private BigDecimal question;

  public UserAnswerInputDto answer(BigDecimal answer) {
    this.answer = answer;
    return this;
  }

  /**
   * Get answer
   * @return answer
  */
  //@ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getAnswer() {
    return answer;
  }

  public void setAnswer(BigDecimal answer) {
    this.answer = answer;
  }

  public UserAnswerInputDto question(BigDecimal question) {
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

  public BigDecimal getQuestion() {
    return question;
  }

  public void setQuestion(BigDecimal question) {
    this.question = question;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAnswerInputDto userAnswerInputDto = (UserAnswerInputDto) o;
    return Objects.equals(this.answer, userAnswerInputDto.answer) &&
        Objects.equals(this.question, userAnswerInputDto.question);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answer, question);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAnswerInputDto {\n");
    
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
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

