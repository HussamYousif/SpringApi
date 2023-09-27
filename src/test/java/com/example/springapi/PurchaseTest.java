package com.example.springapi;

import com.example.springapi.Interfaces.IPurchaseService;
import com.example.springapi.Services.PurchaseService;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PurchaseTest {

    private final IPurchaseService service = new PurchaseService();

    @Test
    public void TestApplyDiscount() {
        var input = new ArrayList<String>();
        input.add("001");
        input.add("001");

        var actual = service.CalculatePurchasePrice(input);

        assertEquals(15, actual, "Two discounted products should cost ");
    }

    @Test
    public void TestSingleProductWithNoDiscount() {
        var input = new ArrayList<String>();
        input.add("001");

        var actual = service.CalculatePurchasePrice(input);

        assertEquals(26, actual, "Two discounted products should cost ");
    }

    @Test
    public void TestApplyABunchOfProductsNoDiscount() {
        var input = new ArrayList<String>();
        input.add("001"); // 26
        input.add("002"); // 5
        input.add("003"); // 10
        input.add("004"); // 15
        input.add("005"); // 20

        var actual = service.CalculatePurchasePrice(input);

        assertEquals(76, actual, "Two discounted products should cost ");
    }


    @Test
    public void TestApplyABunchOfDiscounts() {
        var input = new ArrayList<String>();
        input.add("001");
        input.add("001"); // 15

        input.add("002");
        input.add("002");
        input.add("002");
        input.add("002");
        input.add("002"); // 20

        input.add("003");
        input.add("003");
        input.add("003"); // 25

        input.add("004");
        input.add("004"); // 28

        var actual = service.CalculatePurchasePrice(input);

        assertEquals(88, actual, "Two discounted products should cost ");
    }

    @Test
    public void TestApplyDiscountMultipleTimes() {
        var input = new ArrayList<String>();
        input.add("001");
        input.add("001"); // 15

        input.add("001");
        input.add("001"); // 15

        input.add("001");
        input.add("001"); // 15

        input.add("001");
        input.add("001"); // 15


        var actual = service.CalculatePurchasePrice(input);

        assertEquals(60, actual, "Two discounted products should cost ");
    }

    @Test
    public void TestApplyDiscountAndNotApplyDiscountForOneProduct() {
        var input = new ArrayList<String>();
        input.add("001");
        input.add("001"); // 15

        input.add("001");
        input.add("001"); // 15

        input.add("001");
        input.add("001"); // 15

        input.add("001");
        input.add("001"); // 15

        input.add("001"); // 26


        var actual = service.CalculatePurchasePrice(input);

        assertEquals(86, actual, "Two discounted products should cost ");
    }

    @Test
    public void TestApplyABunchOfRandomThings() {
        var input = new ArrayList<String>();
        input.add("001");
        input.add("001"); // 15

        input.add("002"); // 5 = 20

        input.add("003");
        input.add("003");
        input.add("003"); // 25 = 45

        input.add("003"); // 10
        input.add("003"); // 10 = 65



        input.add("005"); // 20
        input.add("005"); // 20
        input.add("005"); // 20
        input.add("005"); // 20
        input.add("005"); // 20  165

        input.add("004"); // 15



        var actual = service.CalculatePurchasePrice(input);

        assertEquals(180, actual, "Two discounted products should cost ");
    }

}
