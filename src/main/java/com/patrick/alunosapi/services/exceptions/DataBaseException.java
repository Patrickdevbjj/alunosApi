package com.patrick.alunosapi.services.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class DataBaseException extends RuntimeException {

    public DataBaseException(String message) {
        super(message);
    }
}
