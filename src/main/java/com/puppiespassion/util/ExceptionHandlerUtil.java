package com.puppiespassion.util;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class ExceptionHandlerUtil {
    public static void logValidationErrors(BindingResult bindingResult) {
        for (FieldError error : bindingResult.getFieldErrors()) {
            log.error("Validation error - Field: {}, Message: {}", error.getField(), error.getDefaultMessage());
        }
    }

    public static void handleConstraintViolationException(ConstraintViolationException e) {
        List<String> errorMessage = new ArrayList<>();

        for (ConstraintViolation<?> violation : e.getConstraintViolations()) {
            errorMessage.add("Error message: " + violation.getMessage());
        }
    }
}
