package com.example.springexceptionhandling.error;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {

    TEST(HttpStatus.INTERNAL_SERVER_ERROR, "001", "exception test"),
    NOT_EXISTS_DATA(HttpStatus.BAD_REQUEST, "002", "존재하지 않는 데이터입니다."),
    NOT_VALID_DATA(HttpStatus.BAD_REQUEST, "003", "유효하지 않는 데이터입니다."),
    INVALID_DATA_TYPE(HttpStatus.BAD_REQUEST, "004", "잘못된 데이터 타입입니다."),
    ALREADY_REGISTERED_DATA(HttpStatus.BAD_REQUEST, "005", "이미 존재하는 데이터입니다."),
    FORBIDDEN_ROLE(HttpStatus.FORBIDDEN, "006", "해당 Role이 아닙니다."),
    ;

    private HttpStatus httpStatus;
    private String errorCode;
    private String message;

    ErrorCode(HttpStatus httpStatus, String errorCode, String message) {
        this.httpStatus = httpStatus;
        this.errorCode = errorCode;
        this.message = message;
    }
}
