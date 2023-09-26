package com.example.springapi.Interfaces;

import com.example.springapi.Models.Product;

public abstract class Discount {
    public int productId;
    public abstract int applyDiscount(Product product, int quantity);
}
