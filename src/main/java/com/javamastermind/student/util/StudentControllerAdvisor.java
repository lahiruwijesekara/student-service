/**
 * 
 */
package com.javamastermind.student.util;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConversionException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.javamastermind.student.model.ErrorResponse;

/**
 * @author lahiru_w
 */
@ControllerAdvice
public class StudentControllerAdvisor
{

    @ExceptionHandler({MethodArgumentNotValidException.class})
    public ResponseEntity<Object> argumentError(MethodArgumentNotValidException ex)
    {

        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return new ResponseEntity<Object>(errors, new HttpHeaders(), HttpStatus.BAD_GATEWAY);
    }

    @ExceptionHandler({HttpMessageConversionException.class})
    public ResponseEntity<Object> messageConversionError(HttpMessageConversionException ex)
    {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setDescription("An unreconginzed message");
        errorResponse.setErrorCode("69");
        return new ResponseEntity<Object>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler({Exception.class})
    public ResponseEntity<Object> error(Exception exception)
    {
        return new ResponseEntity<Object>("An Error occured", HttpStatus.BAD_GATEWAY);
    }
}
