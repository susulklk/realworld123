package com.example.exception;

import com.example.err.Error;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class AppException extends RuntimeException {
    private  Error error;
    public AppException(Error error) {
        super(error.getMessage());
        this.error = error;
    }


}
