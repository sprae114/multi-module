package com.example.firstmodule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(
        scanBasePackages = {
                "com.example.firstmodule",
                "com.example.commonmodule"
        }
)
@EntityScan(basePackages = "com.example.commonmodule.domain") // JPA Entity 스캔 경로
@EnableJpaRepositories(basePackages = "com.example.commonmodule.repsitory") // JPA Repository 스캔 경로
public class FirstModuleApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstModuleApplication.class, args);
    }

}
