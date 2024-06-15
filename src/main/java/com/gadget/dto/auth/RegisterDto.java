package com.gadget.dto.auth;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.gadget.annotation.PasswordValid;
import com.gadget.annotation.PhoneNumberValid;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class RegisterDto {

    @NotEmpty
    private String firstName;

    @NotEmpty
    private String lastName;

    @Email
    @NotEmpty
    private String email;

    @PhoneNumberValid
    @NotEmpty
    private String phone;

    @PasswordValid
    @Size(min = 8)
    @NotEmpty
    private String password;

    @Size(min = 8)
    @NotEmpty
    private String passwordConfirmation;

    private RoleEnum role;

    public enum RoleEnum {
        ISSUER("ISSUER"),
        INVESTOR("INVESTOR");

        private final String value;

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

}

