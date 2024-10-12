package com.puppiespassion;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class ExceptionHandlerUtil {
    private static final Logger log = LoggerFactory.getLogger(ExceptionHandlerUtil.class);

    public static void handleConstraintViolationException(ConstraintViolationException e) {
        List<String> errorMessage = new ArrayList<>();

        for (ConstraintViolation<?> violation : e.getConstraintViolations()) {
            errorMessage.add("Error message: " + violation.getMessage());
        }
        errorMessage.forEach(log::error);
    }
}
