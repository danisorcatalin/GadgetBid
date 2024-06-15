package com.gadget.dto.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
//import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Optional;

import javax.validation.Valid;

/**
 * UserUpdateDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-17T22:18:00.554+02:00[Europe/Bucharest]")
public class UserUpdateDto   {
  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("email")
  private String email;

  @JsonProperty("phone")
  private String phone;

  @JsonProperty("password")
  private String password;

  /**
   * Gets or Sets role
   */
  public enum RoleEnum {
    ADMIN("ADMIN"),
    
    ACCOUNT_MANAGER("ACCOUNT_MANAGER"),
    
    AUDITOR("AUDITOR"),
    
    ISSUER("ISSUER"),
    
    INVESTOR("INVESTOR"),
    
    USER("USER");

    private String value;

    RoleEnum(String value) {
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
    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("role")
  private RoleEnum role;

  @JsonProperty("address")
  private Optional<String> address = Optional.empty();

  @JsonProperty("personalNumber")
  private Optional<String> personalNumber = Optional.empty();

  @JsonProperty("walletId")
  private Optional<String> walletId = Optional.empty();

  /**
   * Gets or Sets cardType
   */
  public enum CardTypeEnum {
    PASSPORT("PASSPORT"),
    
    ID_CARD("ID_CARD"),
    
    DRIVERS_LICENSE("DRIVERS_LICENSE"),
    
    RESIDENCE_PERMIT("RESIDENCE_PERMIT"),
    
    OTHER("OTHER");

    private String value;

    CardTypeEnum(String value) {
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
    public static CardTypeEnum fromValue(String value) {
      for (CardTypeEnum b : CardTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("cardType")
  private Optional<CardTypeEnum> cardType = Optional.empty();

  @JsonProperty("cardNumber")
  private Optional<String> cardNumber = Optional.empty();

  @JsonProperty("cardValidFrom")
  private Optional<String> cardValidFrom = Optional.empty();

  @JsonProperty("cardValidUntil")
  private Optional<String> cardValidUntil = Optional.empty();

  @JsonProperty("country")
  private Optional<String> country = Optional.empty();

  @JsonProperty("dateOfBirth")
  private Optional<String> dateOfBirth = Optional.empty();

  @JsonProperty("kycCompleted")
  private BigDecimal kycCompleted = new BigDecimal("0");

  @JsonProperty("tourComplete")
  private BigDecimal tourComplete = new BigDecimal("0");

  @JsonProperty("onboard")
  private UserOnboardInput onboard;

  @JsonProperty("twoFactorActivated")
  private BigDecimal twoFactorActivated;

  public UserUpdateDto firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  //@ApiModelProperty(value = "")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UserUpdateDto lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  //@ApiModelProperty(value = "")


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UserUpdateDto email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  //@ApiModelProperty(value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserUpdateDto phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
  */
  //@ApiModelProperty(value = "")


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public UserUpdateDto password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  */
  //@ApiModelProperty(value = "")


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserUpdateDto role(RoleEnum role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
  */
  //@ApiModelProperty(value = "")


  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public UserUpdateDto address(String address) {
    this.address = Optional.of(address);
    return this;
  }

  /**
   * Get address
   * @return address
  */
  //@ApiModelProperty(value = "")


  public Optional<String> getAddress() {
    return address;
  }

  public void setAddress(Optional<String> address) {
    this.address = address;
  }

  public UserUpdateDto personalNumber(String personalNumber) {
    this.personalNumber = Optional.of(personalNumber);
    return this;
  }

  /**
   * Get personalNumber
   * @return personalNumber
  */
  //@ApiModelProperty(value = "")


  public Optional<String> getPersonalNumber() {
    return personalNumber;
  }

  public void setPersonalNumber(Optional<String> personalNumber) {
    this.personalNumber = personalNumber;
  }

  public UserUpdateDto walletId(String walletId) {
    this.walletId = Optional.of(walletId);
    return this;
  }

  /**
   * Get walletId
   * @return walletId
  */
  //@ApiModelProperty(value = "")


  public Optional<String> getWalletId() {
    return walletId;
  }

  public void setWalletId(Optional<String> walletId) {
    this.walletId = walletId;
  }

  public UserUpdateDto cardType(CardTypeEnum cardType) {
    this.cardType = Optional.of(cardType);
    return this;
  }

  /**
   * Get cardType
   * @return cardType
  */
  //@ApiModelProperty(value = "")


  public Optional<CardTypeEnum> getCardType() {
    return cardType;
  }

  public void setCardType(Optional<CardTypeEnum> cardType) {
    this.cardType = cardType;
  }

  public UserUpdateDto cardNumber(String cardNumber) {
    this.cardNumber = Optional.of(cardNumber);
    return this;
  }

  /**
   * Get cardNumber
   * @return cardNumber
  */
  //@ApiModelProperty(value = "")


  public Optional<String> getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(Optional<String> cardNumber) {
    this.cardNumber = cardNumber;
  }

  public UserUpdateDto cardValidFrom(String cardValidFrom) {
    this.cardValidFrom = Optional.of(cardValidFrom);
    return this;
  }

  /**
   * Get cardValidFrom
   * @return cardValidFrom
  */
  //@ApiModelProperty(value = "")


  public Optional<String> getCardValidFrom() {
    return cardValidFrom;
  }

  public void setCardValidFrom(Optional<String> cardValidFrom) {
    this.cardValidFrom = cardValidFrom;
  }

  public UserUpdateDto cardValidUntil(String cardValidUntil) {
    this.cardValidUntil = Optional.of(cardValidUntil);
    return this;
  }

  /**
   * Get cardValidUntil
   * @return cardValidUntil
  */
  //@ApiModelProperty(value = "")


  public Optional<String> getCardValidUntil() {
    return cardValidUntil;
  }

  public void setCardValidUntil(Optional<String> cardValidUntil) {
    this.cardValidUntil = cardValidUntil;
  }

  public UserUpdateDto country(String country) {
    this.country = Optional.of(country);
    return this;
  }

  /**
   * Get country
   * @return country
  */
  //@ApiModelProperty(value = "")


  public Optional<String> getCountry() {
    return country;
  }

  public void setCountry(Optional<String> country) {
    this.country = country;
  }

  public UserUpdateDto dateOfBirth(String dateOfBirth) {
    this.dateOfBirth = Optional.of(dateOfBirth);
    return this;
  }

  /**
   * Get dateOfBirth
   * @return dateOfBirth
  */
  //@ApiModelProperty(value = "")


  public Optional<String> getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Optional<String> dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public UserUpdateDto kycCompleted(BigDecimal kycCompleted) {
    this.kycCompleted = kycCompleted;
    return this;
  }

  /**
   * Get kycCompleted
   * @return kycCompleted
  */
  //@ApiModelProperty(value = "")

  @Valid

  public BigDecimal getKycCompleted() {
    return kycCompleted;
  }

  public void setKycCompleted(BigDecimal kycCompleted) {
    this.kycCompleted = kycCompleted;
  }

  public UserUpdateDto tourComplete(BigDecimal tourComplete) {
    this.tourComplete = tourComplete;
    return this;
  }

  /**
   * Get tourComplete
   * @return tourComplete
  */
  //@ApiModelProperty(value = "")

  @Valid

  public BigDecimal getTourComplete() {
    return tourComplete;
  }

  public void setTourComplete(BigDecimal tourComplete) {
    this.tourComplete = tourComplete;
  }

  public UserUpdateDto onboard(UserOnboardInput onboard) {
    this.onboard = onboard;
    return this;
  }

  /**
   * Get onboard
   * @return onboard
  */
  //@ApiModelProperty(value = "")

  @Valid

  public UserOnboardInput getOnboard() {
    return onboard;
  }

  public void setOnboard(UserOnboardInput onboard) {
    this.onboard = onboard;
  }

  public UserUpdateDto twoFactorActivated(BigDecimal twoFactorActivated) {
    this.twoFactorActivated = twoFactorActivated;
    return this;
  }

  /**
   * Get twoFactorActivated
   * @return twoFactorActivated
  */
  //@ApiModelProperty(value = "")

  @Valid

  public BigDecimal getTwoFactorActivated() {
    return twoFactorActivated;
  }

  public void setTwoFactorActivated(BigDecimal twoFactorActivated) {
    this.twoFactorActivated = twoFactorActivated;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserUpdateDto userUpdateDto = (UserUpdateDto) o;
    return Objects.equals(this.firstName, userUpdateDto.firstName) &&
        Objects.equals(this.lastName, userUpdateDto.lastName) &&
        Objects.equals(this.email, userUpdateDto.email) &&
        Objects.equals(this.phone, userUpdateDto.phone) &&
        Objects.equals(this.password, userUpdateDto.password) &&
        Objects.equals(this.role, userUpdateDto.role) &&
        Objects.equals(this.address, userUpdateDto.address) &&
        Objects.equals(this.personalNumber, userUpdateDto.personalNumber) &&
        Objects.equals(this.walletId, userUpdateDto.walletId) &&
        Objects.equals(this.cardType, userUpdateDto.cardType) &&
        Objects.equals(this.cardNumber, userUpdateDto.cardNumber) &&
        Objects.equals(this.cardValidFrom, userUpdateDto.cardValidFrom) &&
        Objects.equals(this.cardValidUntil, userUpdateDto.cardValidUntil) &&
        Objects.equals(this.country, userUpdateDto.country) &&
        Objects.equals(this.dateOfBirth, userUpdateDto.dateOfBirth) &&
        Objects.equals(this.kycCompleted, userUpdateDto.kycCompleted) &&
        Objects.equals(this.tourComplete, userUpdateDto.tourComplete) &&
        Objects.equals(this.onboard, userUpdateDto.onboard) &&
        Objects.equals(this.twoFactorActivated, userUpdateDto.twoFactorActivated);
  }

  private static <T> boolean equalsNullable(Optional<T> a, Optional<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, email, phone, password, role, address, personalNumber, walletId, cardType, cardNumber, cardValidFrom, cardValidUntil, country, dateOfBirth, kycCompleted, tourComplete, onboard, twoFactorActivated);
  }

  private static <T> int hashCodeNullable(Optional<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserUpdateDto {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    personalNumber: ").append(toIndentedString(personalNumber)).append("\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    cardValidFrom: ").append(toIndentedString(cardValidFrom)).append("\n");
    sb.append("    cardValidUntil: ").append(toIndentedString(cardValidUntil)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    kycCompleted: ").append(toIndentedString(kycCompleted)).append("\n");
    sb.append("    tourComplete: ").append(toIndentedString(tourComplete)).append("\n");
    sb.append("    onboard: ").append(toIndentedString(onboard)).append("\n");
    sb.append("    twoFactorActivated: ").append(toIndentedString(twoFactorActivated)).append("\n");
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

