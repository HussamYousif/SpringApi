package com.example.springapi.Repositories;

import com.example.springapi.Interfaces.Discount;
import com.example.springapi.Models.QuantityDiscount;

import java.util.ArrayList;
import java.util.List;

public class DiscountTestData {

     static List<Discount> GetDiscounts() {
        var discounts = new ArrayList<Discount>();

        discounts.add(new QuantityDiscount("001", 2, 15));
        discounts.add(new QuantityDiscount("002", 5, 20));
        discounts.add(new QuantityDiscount("003", 3, 25));
        discounts.add(new QuantityDiscount("004", 2, 28));
        discounts.add(new QuantityDiscount("005", 2, 60));
        discounts.add(new QuantityDiscount("006", 5, 350));

        return discounts;
    }
}
