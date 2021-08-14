package com.Admin.config;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.Admin.entities.airlineNotFoundEntity;

@ControllerAdvice
public class CustomControllerAdvice {
	@ExceptionHandler(value = Exception.class)
    public ResponseEntity<airlineNotFoundEntity> handleException(Exception e){
        return ResponseEntity.status(200).body(new airlineNotFoundEntity(204, e.getMessage()));
    }
}