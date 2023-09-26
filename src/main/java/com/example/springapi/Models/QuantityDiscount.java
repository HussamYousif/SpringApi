package com.example.springapi.Models;

import com.example.springapi.Interfaces.IDiscount;

import java.util.List;
import java.util.stream.Collectors;

public class QuantityDiscount implements IDiscount {
    String discountId;
    int quantityForDiscount;
    int discountPrice;

    @Override
    public int ApplyIDiscount(Product product, int quantity) {
        if (quantity < quantityForDiscount) {
            return quantity*product.price();
        }

        int discounted = (quantity / quantityForDiscount) * discountPrice;
        // TODO: test the modulus operator.
        int rest = (quantity % quantityForDiscount) * product.price() ;

        return discounted + rest;
    }
}
