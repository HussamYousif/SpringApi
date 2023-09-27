package com.example.springapi.Models;

import java.util.Objects;

public record Product(String productId, String productName, int price, String discountId) {

    public boolean hasDiscount() {
        return discountId != null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productId, product.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }
}
