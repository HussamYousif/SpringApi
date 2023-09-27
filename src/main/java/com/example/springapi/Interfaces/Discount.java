package com.example.springapi.Interfaces;

import com.example.springapi.Models.Product;

public abstract class Discount {

    public String discountId;

    public Discount(String discountId) {
        this.discountId = discountId;
    }

    public String getDiscountId() {
        return discountId;
    }

    public abstract int getDiscountedPrice(Product product, int quantity);
}
