package com.example.commonmodule.service;

import com.example.commonmodule.repsitory.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommonDemoService {
    public final MemberRepository memberRepository;

    public String getModuleName() {
        return "common-moudle";
    }
}