package com.police.app03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class App03Application {
    public static void main(String[] args) {
        SpringApplication.run(App03Application.class,args);
    }
}
