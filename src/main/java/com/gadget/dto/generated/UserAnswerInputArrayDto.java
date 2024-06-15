package com.gadget.dto.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
//import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserAnswerInputArrayDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-17T22:18:00.554+02:00[Europe/Bucharest]")
public class UserAnswerInputArrayDto   {
  @JsonProperty("qa")
  @Valid
  private List<UserAnswerInputDto> qa = new ArrayList<>();

  public UserAnswerInputArrayDto qa(List<UserAnswerInputDto> qa) {
    this.qa = qa;
    return this;
  }

  public UserAnswerInputArrayDto addQaItem(UserAnswerInputDto qaItem) {
    this.qa.add(qaItem);
    return this;
  }

  /**
   * Get qa
   * @return qa
  */
  //@ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<UserAnswerInputDto> getQa() {
    return qa;
  }

  public void setQa(List<UserAnswerInputDto> qa) {
    this.qa = qa;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAnswerInputArrayDto userAnswerInputArrayDto = (UserAnswerInputArrayDto) o;
    return Objects.equals(this.qa, userAnswerInputArrayDto.qa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAnswerInputArrayDto {\n");
    
    sb.append("    qa: ").append(toIndentedString(qa)).append("\n");
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

