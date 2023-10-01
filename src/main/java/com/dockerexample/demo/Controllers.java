package com.dockerexample.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controllers {

    @GetMapping("/message")
    public String getMessage() {
        return "Welcome to JavaTechie..!!";
    }

}
