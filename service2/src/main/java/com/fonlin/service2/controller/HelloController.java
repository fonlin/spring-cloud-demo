package com.fonlin.service2.controller;

import com.fonlin.service2.feign.Service1FeignClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author fonlin
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Value("${spring.application.name}")
    private String name;

    @Resource
    private Service1FeignClient service1FeignClient;

    @GetMapping
    public String hello() {
        return "Hello, my name is " + name + ".And this is my friend: " + service1FeignClient.hello();
    }

}
