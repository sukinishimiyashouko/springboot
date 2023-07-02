package com.wbu.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther 11852
 * @create 2023/6/5
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello SpringBoot";
    }
}
