package com.poc.cicd_test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {
    @GetMapping("/hello_world")
    public String helloWorld(){
        String greeting = "hello us-west-1";
        log.info(greeting);
        return greeting;
    }
}
