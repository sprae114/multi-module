package com.example.firstmodule.service;

import com.example.commonmodule.domain.Member;
import com.example.commonmodule.enums.CodeEnum;
import com.example.commonmodule.repsitory.MemberRepository;
import com.example.commonmodule.service.CommonDemoService;
import com.example.firstmodule.exception.CustomException;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class DemoService {

    private final CommonDemoService commonDemoService;
    private final MemberRepository memberRepository;

    public String save(){
        memberRepository.save(Member.builder()
                                    .name(Thread.currentThread().getName())
                                    .build());

        System.out.println(CodeEnum.SUCCESS.getCode());
        System.out.println(commonDemoService.getModuleName());
        return "save";
    }

    public String find(){
        int size = memberRepository.findAll().size();
        System.out.println("size : " + size);

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