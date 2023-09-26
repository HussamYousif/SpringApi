package com.example.springapi.Models;

import com.example.springapi.Interfaces.Discount;

public class QuantityDiscount extends Discount {
    String discountId;
    int quantityForDiscount;
    int discountPrice;

    @Override
    public int applyDiscount(Product product, int quantity) {
        if (quantity < quantityForDiscount) {
            return quantity*product.price();
        }

        int discounted = (quantity / quantityForDiscount) * discountPrice;
        // TODO: test the modulus operator.
        int rest = (quantity % quantityForDiscount) * product.price() ;

        return discounted + rest;
    }
}
