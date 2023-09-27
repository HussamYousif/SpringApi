package com.example.springapi.Controllers;

import com.example.springapi.Interfaces.IPurchaseService;
import com.example.springapi.Models.CheckoutResponse;
import com.example.springapi.Services.PurchaseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PurchaseController {

    private final IPurchaseService iPurchaseService = new PurchaseService();

    @GetMapping("/api/v1/healthcheck")
    public String healthcheck() {
        return "It's alive!";
    }

    @PostMapping("/api/v1/checkout")
    public CheckoutResponse checkout(@RequestBody List<String> products) {
        return new CheckoutResponse(iPurchaseService.CalculatePurchasePrice(products));
    }
}
