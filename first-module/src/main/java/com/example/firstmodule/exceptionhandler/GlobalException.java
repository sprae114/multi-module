package com.example.firstmodule.exceptionhandler;

import com.example.commonmodule.enums.CodeEnum;
import com.example.firstmodule.exception.CustomException;
import com.example.firstmodule.response.CommonResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice // 예외 처리를 위한 클래스임을 명시
public class GlobalException {

    @ExceptionHandler(CustomException.class)
    public CommonResponse customException(CustomException e) { // customException이 발생하면 이 메서드가 실행된다.
        return CommonResponse.builder()
                .returnCode(e.getReturnCode())
                .returnMessage(e.getReturnMessage())
                .build();
    }

    @ExceptionHandler(Exception.class)
    public CommonResponse handleException(Exception e) { // 만약 예기치 못한 예외가 발생했다면 이 메서드가 실행된다.
        return CommonResponse.builder()
                .returnCode(CodeEnum.UNKNOWN_ERROR.getCode())
                .returnMessage(CodeEnum.UNKNOWN_ERROR.getMessage())
                .build();
    }
}
