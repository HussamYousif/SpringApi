package com.example.springapi.Models;

import com.example.springapi.Interfaces.IDiscount;

public record Product(String productId, String productName, int price,  String discountId) {
}
