package com.jb.springboot.springbootvalidationexceptionhandle.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class InputExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, String> handleInputException (MethodArgumentNotValidException exception){
        Map<String, String> exMap = new HashMap<>();
        exception.getBindingResult().getFieldErrors().forEach(ex -> System.out.println("======"+ ex));
        exception.getFieldErrors().forEach(ex -> {
            System.out.println(ex);
            exMap.put(ex.getField(), ex.getDefaultMessage());
        });
        return  exMap;
    }
}
