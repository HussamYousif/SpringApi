package com.example.springapi.Repositories;

import com.example.springapi.Models.DiscountBase;
import com.example.springapi.Interfaces.IDiscountRepository;
import java.util.List;

public class DiscountRepository implements IDiscountRepository {

    public List<DiscountBase> getDiscounts(List<String> discountIds) {
        return DiscountTestData.GetDiscounts().stream().filter(discount -> discountIds.contains(discount.discountId)).toList();
    }
}
