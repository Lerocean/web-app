package com.lerocean.smer.controller;

import com.lerocean.smer.dto.ExceptionSerialize;
import jakarta.persistence.EntityNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class DiaryRecordsControllerAdvice {

    @ExceptionHandler(EntityNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ExceptionSerialize entityNotFoundException(EntityNotFoundException exception) {
        log.error(exception.getMessage());
        return new ExceptionSerialize(exception.getMessage());
    }
}
