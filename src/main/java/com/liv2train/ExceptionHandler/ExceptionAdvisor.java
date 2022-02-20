package com.liv2train.ExceptionHandler;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ExceptionAdvisor extends ResponseEntityExceptionHandler {


    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {

        Map<String,String> errors = new HashMap<>();

        ex.getBindingResult().getAllErrors().forEach((e)->{
                String fieldName = ((FieldError) e).getField();
                String message = e.getDefaultMessage();
                errors.put(fieldName,message);
        });
        errors.put("path",request.getDescription(false));
        errors.put("time",(new Date()).toString());
        return new ResponseEntity<Object>(errors,HttpStatus.BAD_REQUEST);
    }


}
