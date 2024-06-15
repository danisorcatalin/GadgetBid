package com.gadget.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^\\w\\d\\s]).{8,}$")
@Size(min = 8)
@NotEmpty
@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = { })
@Documented
public @interface PasswordValid {
    String message() default "Password too weak, must contain at least 1 uppercase letter, 1 lowercase letter, 1 number and 1 special character";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
}
