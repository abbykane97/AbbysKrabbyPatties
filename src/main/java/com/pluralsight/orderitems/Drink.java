package com.pluralsight.orderitems;

import com.pluralsight.com.pluralsight.Interface;

public class Drink implements Interface {
    private String size;
    private String drinkSelection;

    public Drink(String size, String drinkSelection) {
        this.size = size;
        this.drinkSelection = drinkSelection;

        switch (size.toLowerCase()) {
            case "small":
                double price = 2.0;
                break;
            case "medium":
                price = 2.5;
                break;
            case "large":
                price = 3.0;
                break;
            default:
                throw new IllegalArgumentException("Invalid drink size.");

        }
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDrinkSelection() {
        return drinkSelection;
    }

    public void setDrinkSelection(String drinkSelection) {
        this.drinkSelection = drinkSelection;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
