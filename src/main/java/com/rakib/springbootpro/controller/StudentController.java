package com.rakib.springbootpro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/hello")
    public String greeting() {
        return "Hello Rakib ! Start From 0";
    }

}
