package com.renan.gc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class FourthController {

    @GetMapping
    public String controller() {
        return "Está FUncionando.";
    }

}
