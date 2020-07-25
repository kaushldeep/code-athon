package com.kaush.paypal.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.kaush"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}