package com.example.springapi.Models;

public class CheckoutResponse {
    int price;

    public CheckoutResponse(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
