package com.example.firstmodule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        scanBasePackages = {
                "com.example.firstmodule",
                "com.example.commonmodule"
        }
)
public class FirstModuleApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstModuleApplication.class, args);
    }

}
