package com.rakib.springbootpro.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    /*Inject Properties*/
    @Value("${team.name}")
    private String teamName;
    @Value("${captain.name}")
    private String captainName;

    @GetMapping("/teamInfo")
    public String teamInfo() {
        return "Team Name : " + teamName + " Captain Name  :  " + captainName;
    }

    @GetMapping("/hello")
    public String greeting() {
        return "Hello Rakib ! Start From 0";
    }

}
