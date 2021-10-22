package com.yjxxt.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 * @since 1.0.0
 */
@SpringBootApplication
@MapperScan("com.yjxxt.server.mapper")
public class VoaApplication {
    public static void main(String[] args) {
        SpringApplication.run(VoaApplication.class,args);
    }
}
