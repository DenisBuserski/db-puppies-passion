package com.puppiespassion.util;

import com.puppiespassion.model.dto.UserRegistrationDTO;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.lang.reflect.Field;

public class PasswordMatcher implements ConstraintValidator<PasswordMatches, UserRegistrationDTO> {

    @Override
    public boolean isValid(UserRegistrationDTO user, ConstraintValidatorContext context) {
        return user.getPassword() != null && user.getPassword().equals(user.getConfirmPassword());
    }
}
