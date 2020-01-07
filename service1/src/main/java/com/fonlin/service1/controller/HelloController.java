package com.fonlin.service1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fonlin
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Value("${spring.application.name}")
    private String name;

    @GetMapping
    public String hello() {
        return "hello, this is " + name;
    }

}
