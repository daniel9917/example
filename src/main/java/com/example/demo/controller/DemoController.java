package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("hello-world")
    public String helloWorld () {
        return "Hello world! It's " + LocalDateTime.now().format(DateTimeFormatter.ISO_DATE);
    }
}
