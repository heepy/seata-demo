package com.dubbo.seataaccoutservicedemo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class SeataAccoutServiceDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeataAccoutServiceDemoApplication.class, args);
    }

}
