package com.battlegao.usercurd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.battlegao.usercurd.Dao")
public class UsercurdApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsercurdApplication.class, args);
    }

}
