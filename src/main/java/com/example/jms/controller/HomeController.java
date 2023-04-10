package com.example.jms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String init(){
        return "<ol><li>privet</li><li>hello</li></ol>";
    }
}
