package com.project.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.LinkedHashMap;
import java.util.Map;

    @ControllerAdvice
    public class ExHandler {

        @ExceptionHandler(value = {ConstraintViolationException.class})
        protected ResponseEntity<Object> validation(ConstraintViolationException ex) {

            Map<String, String> error = new LinkedHashMap<>();
            for (ConstraintViolation<?> e : ex.getConstraintViolations()) {
                error.put(e.getPropertyPath().toString(), e.getMessage());
            }
            return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
        }
    }


