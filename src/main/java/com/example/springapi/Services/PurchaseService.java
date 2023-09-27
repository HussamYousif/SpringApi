package com.example.springapi.Services;

import com.example.springapi.Models.DiscountBase;
import com.example.springapi.Interfaces.IDiscountRepository;
import com.example.springapi.Interfaces.IProductRepository;
import com.example.springapi.Interfaces.IPurchaseService;
import com.example.springapi.Models.Product;
import com.example.springapi.Repositories.DiscountRepository;
import com.example.springapi.Repositories.ProductRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class PurchaseService implements IPurchaseService {
    private final IProductRepository iProductRepository = new ProductRepository();
    private final IDiscountRepository iDiscountRepository = new DiscountRepository();

    @Override
    public int CalculatePurchasePrice(List<String> productIds) {
        var products = iProductRepository.GetProducts(productIds);
        var discounts = iDiscountRepository.getDiscounts(
            products
                .stream()
                .filter(p -> p.hasDiscount())
                .map(p -> p.discountId()).toList()
        );

        List<Product> productsWithDiscount = new ArrayList<>();
        List<Product> productsWithoutDiscount = new ArrayList<>();

        for (var product : products) {
            if (product.hasDiscount()) {
                productsWithDiscount.add(product);
            } else {
                productsWithoutDiscount.add(product);
            }
        }

        HashMap<String, Integer> discountedProductsFrequency = new HashMap<>();
        for (Product product : productsWithDiscount) {
            var id = product.productId();

            if (!discountedProductsFrequency.containsKey(id)) {
                discountedProductsFrequency.put(id, 1);
            } else {
                var frequency = discountedProductsFrequency.get(id);
                discountedProductsFrequency.put(id, frequency + 1);
            }
        }

        var distinctElements = productsWithDiscount.stream().distinct().toList();
        var discountedPrice = 0;
        for (Product product : distinctElements) {
            var frequency = discountedProductsFrequency.get(product.productId());
            DiscountBase discount = discounts
                .stream()
                .filter(d -> Objects.equals(d.discountId, product.discountId()))
                .toList()
                .get(0); // Get first somehow returns error.

            discountedPrice += discount.getDiscountedPrice(product, frequency);
        }

        var nonDiscountedPrice = sum(productsWithoutDiscount.stream().map(Product::price).toList());
        return discountedPrice + nonDiscountedPrice;
    }


    private static int sum(List<Integer> prices) {
        int results = 0;
        for (Integer price : prices) {
            results += price;
        }
        return results;
    }
}
