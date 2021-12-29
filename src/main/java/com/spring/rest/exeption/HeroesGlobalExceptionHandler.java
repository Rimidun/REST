package com.spring.rest.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HeroesGlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<HeroesIncorrectData> HandleException(NoSuchEmployeeException exception) {
        HeroesIncorrectData data = new HeroesIncorrectData();
        data.setInfo(exception.getMessage());

        return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<HeroesIncorrectData> HandleException(Exception exception) {
        HeroesIncorrectData data = new HeroesIncorrectData();
        data.setInfo(exception.getMessage());

        return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
    }
}
