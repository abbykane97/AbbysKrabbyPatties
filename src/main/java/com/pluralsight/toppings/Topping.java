package com.pluralsight.toppings;

public class Topping  {
    private String name;
    private double price;
    private boolean isPremium;

    public Topping(String name, double price, boolean isPremium) {
        this.name = name;
        this.price = price;
        this.isPremium = isPremium;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice(int size) {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }
}

