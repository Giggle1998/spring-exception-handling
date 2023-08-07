package com.example.springexceptionhandling.error;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ErrorResponse {
    private String httpStatus;
    private String errorCode;
    private String errorMessage;

    public static ErrorResponse of(String httpStatus, String errorCode, String errorMessage) {
        return ErrorResponse.builder()
                .httpStatus(httpStatus)
                .errorCode(errorCode)
                .errorMessage(errorMessage)
                .build();
    }


}
