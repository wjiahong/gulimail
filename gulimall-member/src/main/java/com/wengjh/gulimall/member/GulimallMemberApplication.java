package com.wengjh.gulimall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@MapperScan("com.wengjh.gulimall.member.dao")
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages="com.wengjh.gulimall.member.feign")//扫描接口方法注解
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
