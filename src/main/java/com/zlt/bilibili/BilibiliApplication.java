package com.zlt.bilibili;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.zlt.bilibili.dao")
@SpringBootApplication
public class BilibiliApplication {

    public static void main(String[] args) {

        SpringApplication.run(BilibiliApplication.class, args);
    }

}
