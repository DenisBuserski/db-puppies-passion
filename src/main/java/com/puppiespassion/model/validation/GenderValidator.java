package com.puppiespassion.model.validation;

import com.puppiespassion.model.enums.Gender;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class GenderValidator implements ConstraintValidator<IsValidGender, Gender> {

    @Override
    public boolean isValid(Gender value, ConstraintValidatorContext context) {
        if (value == null) return false;
        try {
            Gender.valueOf(value.name()); // Check if the enum contains the value
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}
