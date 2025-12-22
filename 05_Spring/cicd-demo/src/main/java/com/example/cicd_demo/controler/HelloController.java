package com.example.cicd_demo.controler;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "CI/CD with GitHub Actions is working!";
    }
}
