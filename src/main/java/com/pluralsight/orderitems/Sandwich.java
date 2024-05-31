package com.pluralsight.orderitems;
import com.pluralsight.toppings.Topping;

import java.util.ArrayList;
import java.util.List;


public class Sandwich implements Interface {
    private String breadType;
    private int size;
    private List<Topping> toppings;
    private boolean isToasted;

    public Sandwich(String breadType, int size, boolean isToasted) {
        this.breadType = breadType;
        this.size = size;
        this.toppings = new ArrayList<>();
        this.isToasted = isToasted;
    }


    public String getBreadType() {
        return breadType;
    }

    public double calculatePrice() {
        double basePrice;

        switch (size) {

            case 4:
                basePrice = 5.5;
                break;
            case 8:
                basePrice = 7.0;
                break;
            case 12:
                basePrice = 8.50;
                break;
            default:
                throw new IllegalArgumentException("Invalid sandwich size.");
        }
        double toppingPrice = 0;
        for (Topping topping : toppings) {
            toppingPrice += topping.getPrice(size);
        }
        return basePrice + toppingPrice;
    }

        @Override
        public double getPrice () {
            return calculatePrice();
        }

        public void addTopping(Topping topping) {
        toppings.add(topping);
        }

}






