package com.microservice;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@MapperScan("com.microservice.mapper") //扫描所有接口
@SpringBootApplication
public class ProviderApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication2.class,args);
    }
}

