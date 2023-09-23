package com.battlegao.bcurd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.battlegao.bcurd.mapper")
public class BcurdApplication {

    public static void main(String[] args) {
        SpringApplication.run(BcurdApplication.class, args);
    }

}
