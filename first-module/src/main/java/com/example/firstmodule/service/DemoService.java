package com.example.firstmodule.service;

import com.example.commonmodule.enums.CodeEnum;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
public class DemoService {

    public String save(){
        System.out.println(CodeEnum.SUCCESS.getCode());
        return "save";
    }

    public String find(){
        System.out.println(CodeEnum.NOT_IDENTITY_VERIFIED_USER.getCode());
        return "find";
    }
}