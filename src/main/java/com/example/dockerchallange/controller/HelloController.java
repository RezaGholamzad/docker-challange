package com.example.dockerchallange.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/helloStranger")
    public String helloStranger() {
        return "Hello Stranger";
    }
}
