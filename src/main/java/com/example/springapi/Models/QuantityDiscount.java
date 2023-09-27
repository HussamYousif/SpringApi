package com.example.springapi.Models;

public class QuantityDiscount extends DiscountBase {
    private final int quantityForDiscount;
    private final int discountPrice;

    public QuantityDiscount(String discountId, int quantityForDiscount, int discountPrice) {
        super(discountId);
        this.quantityForDiscount = quantityForDiscount;
        this.discountPrice = discountPrice;
    }

    public String getDiscountId() {
        return discountId;
    }

    @Override
    public int getDiscountedPrice(Product product, int quantity) {
        if (quantity < quantityForDiscount) {
            return quantity*product.price();
        }

        int discounted = (quantity / quantityForDiscount) * discountPrice;
        // TODO: test the modulus operator.
        int rest = (quantity % quantityForDiscount) * product.price() ;

        return discounted + rest;
    }
}
