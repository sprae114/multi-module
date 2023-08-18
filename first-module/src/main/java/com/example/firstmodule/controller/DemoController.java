package com.example.firstmodule.controller;

import com.example.commonmodule.enums.CodeEnum;
import com.example.firstmodule.service.DemoService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor //final로 선언된 필드를 알아서 생성자를 만들어주기
public class DemoController {

    private final DemoService demoService;

    @GetMapping("/save")
    public String save(){
        return demoService.save();
    }

    @GetMapping("/find")
    public String find(){
        return demoService.find();
    }

    @GetMapping("/exception")
    public String exception(){
        return demoService.exception();
    }
}
