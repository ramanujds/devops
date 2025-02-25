package com.rds.app.helloworld.api;

import com.rds.app.helloworld.dto.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @GetMapping
    public Message greet() {
        return new Message("Hello, World!", "Welcome to the world of Spring Boot!", java.time.LocalDate.now());
    }
}
