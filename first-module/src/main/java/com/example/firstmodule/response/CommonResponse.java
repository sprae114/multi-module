package com.example.firstmodule.response;

import com.example.commonmodule.enums.CodeEnum;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.*;

@Getter
@Setter
@Builder
@JsonInclude(Include.NON_NULL)  // null인 필드는 json으로 만들지 않음
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponse<T> {
    /**
     * 클라이언트와 서버의 통신을 위한 객체
     * @param returnCode : 응답 코드
     * @param returnMessage : 응답 메시지
     * @param info : 응답 데이터
     */
    private String returnCode;
    private String returnMessage;
    private T info;

    /**
     * 응답 코드만 받아서 응답 객체를 생성한다.
     * @param codeEnum
     */
    public CommonResponse(CodeEnum codeEnum) {
        this(codeEnum, null);
    }

    /**
     * 응답 데이터만 받아서 응답 객체를 생성한다.
     * @param info
     */
    public CommonResponse(T info) {
        this(CodeEnum.SUCCESS, info);
    }

    /**
     * 응답 코드와 응답 데이터를 받아서 응답 객체를 생성한다.
     * @param codeEnum
     * @param info
     */
    public CommonResponse(CodeEnum codeEnum, T info) {
        setReturnCode(codeEnum);
        setInfo(info);
    }

    /**
     * enum을 사용해 응답 코드를 세팅한다.
     * @param codeEnum
     */
    public void setReturnCode(CodeEnum codeEnum) {
        this.returnCode = codeEnum.getCode();
        this.returnMessage = codeEnum.getMessage();
    }

    /**
     * 성공 응답 객체를 생성한다.
     */
    public static CommonResponse success() {
        return builder()
                .returnCode(CodeEnum.SUCCESS.getCode())
                .returnMessage(CodeEnum.SUCCESS.getMessage())
                .build();
    }
}