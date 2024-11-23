package com.puppiespassion.model.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ TYPE })
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = PasswordMatcher.class)
public @interface PasswordsMatches {
    String message() default "Password and Confirm password must match!";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}




