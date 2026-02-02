package com.example.apitest.controller;

import com.example.apitest.dto.MessageResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/hello")
    public MessageResponse sayHello() {
        return new MessageResponse("Hello Spring Boot API!");
    }
}
