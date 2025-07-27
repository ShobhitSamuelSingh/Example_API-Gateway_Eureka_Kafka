package com.grootiyapa.service2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Service2Controller {

    @GetMapping(name = "/say", value = "/say")
    public String sayHello() {
        return "Hello from Service- 2.";
    }
}
