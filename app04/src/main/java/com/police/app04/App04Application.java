package com.police.app04;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class App04Application {
    public static void main(String[] args) {
        SpringApplication.run(App04Application.class,args);
    }
}
