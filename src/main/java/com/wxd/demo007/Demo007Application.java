package com.wxd.demo007;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wxd.demo007.mapper")
public class Demo007Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo007Application.class, args);
    }

}
