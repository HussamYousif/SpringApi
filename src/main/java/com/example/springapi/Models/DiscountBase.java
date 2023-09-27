package com.example.springapi.Models;

import com.example.springapi.Models.Product;

public abstract class DiscountBase {

    public String discountId;

    public DiscountBase(String discountId) {
        this.discountId = discountId;
    }

    public String getDiscountId() {
        return discountId;
    }

    public abstract int getDiscountedPrice(Product product, int quantity);
}
