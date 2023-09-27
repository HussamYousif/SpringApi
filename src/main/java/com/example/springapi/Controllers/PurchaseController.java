package com.example.springapi.Controllers;

import com.example.springapi.Interfaces.IPurchaseService;
import com.example.springapi.Services.PurchaseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PurchaseController {

    private final IPurchaseService iPurchaseService = new PurchaseService();

    @GetMapping("/api/v1/healthcheck")
    public String healthcheck() {
        return "It's alive!";
    }

    @PostMapping("/api/v1/checkout")
    public int checkout(@RequestBody List<String> products) {
        return iPurchaseService.CalculatePurchasePrice(products);
    }
}
