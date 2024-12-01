package com.example.lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication(scanBasePackages = "com.example.lab.controllers.webflux")
public class WebFluxApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(WebFluxApplication.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "8081"));
        app.run(args);
    }
}