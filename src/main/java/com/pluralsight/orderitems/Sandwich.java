package com.pluralsight.orderitems;

import com.pluralsight.com.pluralsight.Interface;
import com.pluralsight.toppings.Topping;

import java.util.List;


public class Sandwich implements Interface {
    private String breadType;
    private int size;
    private List<Topping> toppings;
    private boolean isToasted;

    public Sandwich(String breadType, int size, List<Topping> toppings, boolean isToasted) {
        this.breadType = breadType;
        this.size = size;
        this.toppings = toppings;
        this.isToasted = isToasted;
    }

    public void addToppings(Topping topping) {
        toppings.add(topping);
    }

    public addExtraToppings(List<Topping> extraToppings) {
        toppings.addAll(extraToppings);
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    @Override
    public double getPrice() {
        double basePrice = ;
        double pricePerTopping = ;
        double totalPrice = basePrice + (size * 1.0);
        totalPrice += toppings.size() * pricePerTopping;
    }

    return totalPrice;
}

