package com.example.springapi.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/api/v1/healthcheck")
    public String healthcheck() {
        return "It's alive!";
    }
}
