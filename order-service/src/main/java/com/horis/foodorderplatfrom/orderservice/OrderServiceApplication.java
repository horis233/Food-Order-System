package com.horis.foodorderplatfrom.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        scanBasePackages = {
                "com.horis.foodorderplatfrom.orderservice.rest",
                "com.horis.foodorderplatfrom.orderservice.domain",
                "com.horis.foodorderplatfrom.orderservice.repository",
                "com.horis.foodorderplatfrom.orderservice.service",
                "com.horis.foodorderplatfrom.orderservice.service.implement",
        })
public class OrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }
}
