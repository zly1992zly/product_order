package com.baizhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProductOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductOrderApplication.class, args);
    }

}
