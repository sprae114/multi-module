package com.example.firstmodule.service;

import com.example.commonmodule.enums.CodeEnum;
import com.example.commonmodule.service.CommonDemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


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
}