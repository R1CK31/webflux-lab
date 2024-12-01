package com.example.lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication(scanBasePackages = "com.example.lab.controllers.mvc")
public class MvcApp {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(MvcApp.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "8080"));
        app.run(args);
    }
}