package com.example.dockerchallange.controller;

import com.example.dockerchallange.util.StringUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/helloStranger")
    public String helloStranger() {
        return "Hello Stranger";
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam String name) {
        return "Hello " + StringUtil.splitByCamelCase(name);
    }
}
