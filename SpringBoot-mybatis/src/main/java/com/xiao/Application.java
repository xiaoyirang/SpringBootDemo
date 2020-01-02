package com.xiao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// 关闭Spring Sercurity功能
// @EnableAutoConfiguration(exclude = {
// org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class
// })
@MapperScan("com.xiao.dao")
public class Application {

    public static void main(String[] args) {
        // SpringBoot应用启动
        SpringApplication.run(Application.class, args);
        System.out.println("SpringBootApplication start success!");
    }
}
