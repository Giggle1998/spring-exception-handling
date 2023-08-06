package com.example.springexceptionhandling.controller;

import com.example.springexceptionhandling.error.ErrorCode;
import com.example.springexceptionhandling.error.exception.TestException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test1")
    public void test1() {
        throw new TestException(ErrorCode.TEST);
    }

    @GetMapping("/test2")
    public void test2() {
        throw new TestException(ErrorCode.NOT_EXISTS_DATA);
    }

    @GetMapping("/test3")
    public void test3() {
        throw new TestException(ErrorCode.NOT_VALID_DATA);
    }

    @GetMapping("/test4")
    public void test4() {
        throw new TestException(ErrorCode.FORBIDDEN_ROLE);
    }

    @GetMapping("/test5")
    public void test5() {
        throw new TestException(ErrorCode.UNSUPPORTED_MEDIA_TYPE);
    }
}
