package com.opntxt.myspringbootapp.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyApi {

    @Value("${MESSAGE:Hello from Spring Boot}")
    private String message;

    @Value("${SECRET_MESSAGE:A secret message}")
    private String secret;

    @GetMapping
    public String sayHello(){
        return message;
    }

    @GetMapping("/secret")
    public String getSecretMessage(){
        return secret;
    }

}
