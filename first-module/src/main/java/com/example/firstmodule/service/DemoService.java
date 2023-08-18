package com.example.firstmodule.service;

import com.example.commonmodule.enums.CodeEnum;
import com.example.commonmodule.service.CommonDemoService;
import com.example.firstmodule.exception.CustomException;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;


@Service
@RequiredArgsConstructor
public class DemoService {

    private final CommonDemoService commonDemoService;

    public String save(){
        System.out.println(CodeEnum.SUCCESS.getCode());
        System.out.println(commonDemoService.getModuleName());
        return "save";
    }

    public String find(){
        System.out.println(CodeEnum.NOT_IDENTITY_VERIFIED_USER.getCode());
        return "find";
    }

    public String exception(){
        if (true) {
            throw new CustomException(CodeEnum.UNKNOWN_ERROR);
        }

        return "exception";
    }
}