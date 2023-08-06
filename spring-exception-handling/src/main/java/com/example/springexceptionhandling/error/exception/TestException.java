package com.example.springexceptionhandling.error.exception;

import com.example.springexceptionhandling.error.ErrorCode;
import lombok.Getter;

@Getter
public class TestException extends RuntimeException{
    private ErrorCode errorCode;

    public TestException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
}
