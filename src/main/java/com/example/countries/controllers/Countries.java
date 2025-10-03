package com.example.countries.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Countries {

    @GetMapping("/countries")
        public String getCountries() {
        return "home/countries";
    }

}
