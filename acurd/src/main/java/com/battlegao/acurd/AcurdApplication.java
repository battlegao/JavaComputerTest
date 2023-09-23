package com.battlegao.acurd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.battlegao.acurd.mapper")
@SpringBootApplication
public class AcurdApplication {

    public static void main(String[] args) {
        SpringApplication.run(AcurdApplication.class, args);
    }

}
