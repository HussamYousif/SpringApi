package com.example.springapi.Interfaces;

import com.example.springapi.Models.Product;

import java.util.List;

public interface IDiscount {

    public int ApplyIDiscount(Product product, int quantity);
}
