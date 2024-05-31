package com.pluralsight.orderitems;

import com.pluralsight.toppings.Cheese;
import com.pluralsight.toppings.Meat;
import com.pluralsight.toppings.Regular;
import com.pluralsight.toppings.Topping;

import java.util.ArrayList;
import java.util.List;


public class Sandwich implements Interface {
    private String breadType;
    private int size;
    private double basePrice;
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

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }


    public double calculatePrice() {
        double basePrice = 0;

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

    public void addTopping(Meat meat) {
    }

    public void addTopping(Regular regular) {
    }

    public void addTopping(Cheese cheese) {
    }
}






