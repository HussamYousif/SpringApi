package com.example.springapi.Interfaces;

import java.util.List;

public interface IDiscountRepository {
    public List<Discount> getDiscounts(List<String> discountIds);

}
