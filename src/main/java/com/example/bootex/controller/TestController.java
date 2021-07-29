package com.example.bootex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping(value="/test")
    public String test(){
        return "test";
    }
    @GetMapping(value="/ssh")
    public String ssh(){
        return "ssh";
    }
    @GetMapping(value="/hope")
    public String hope(){
        return "hopePlease2233";
    }
}
