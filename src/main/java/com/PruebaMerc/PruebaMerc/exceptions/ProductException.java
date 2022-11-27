package com.PruebaMerc.PruebaMerc.exceptions;

import lombok.Data;
import org.springframework.http.HttpStatus;
@Data
public class ProductException extends RuntimeException {

    private String message;
    private HttpStatus httpStatus;

    public ProductException(String message, HttpStatus httpStatus) {
        super(message);
        this.message = message;
        this.httpStatus = httpStatus;
    }
}
