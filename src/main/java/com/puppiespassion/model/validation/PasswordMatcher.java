package com.puppiespassion.model.validation;

import com.puppiespassion.model.dto.UserRegistrationDTO;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PasswordMatcher implements ConstraintValidator<PasswordsMatches, UserRegistrationDTO> {

    @Override
    public boolean isValid(UserRegistrationDTO user, ConstraintValidatorContext context) {
        return user.getPassword() != null && user.getPassword().equals(user.getConfirmPassword());
    }
}
