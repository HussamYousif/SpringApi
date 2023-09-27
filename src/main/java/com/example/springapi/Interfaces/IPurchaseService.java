package com.example.springapi.Interfaces;

import java.util.List;

public interface IPurchaseService {
    public int CalculatePurchasePrice(List<String> productIds);
}
