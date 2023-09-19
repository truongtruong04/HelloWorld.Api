package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/greeting")
public class HelloWorldController {
    @PostMapping("/A/hello_world/{id}")
    public String greetingA(@PathVariable("id") String id){
        return "  truong hello world" +id;
    }
    @GetMapping("/B/hello_world")
    public String greetingB(){
        return "  truong hello world";
    }
}
