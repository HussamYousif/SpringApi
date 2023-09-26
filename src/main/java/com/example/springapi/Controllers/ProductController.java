package com.example.springapi.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/api/v1/healthcheck")
    public String healthcheck() {
        return "It's alive!";
    }

    @PostMapping("/api/v1/checkout")
    public String checkout(@RequestBody List<String> products) {
        return String.join(" ", products);
    }
}
