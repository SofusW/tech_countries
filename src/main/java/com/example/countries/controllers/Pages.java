package com.example.countries.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Pages {

    @GetMapping("/")
    public String index() {
        return "home/index";
    }

}