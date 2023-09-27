package com.example.springapi.Interfaces;

import com.example.springapi.Models.DiscountBase;

import java.util.List;

public interface IDiscountRepository {
    public List<DiscountBase> getDiscounts(List<String> discountIds);

}
