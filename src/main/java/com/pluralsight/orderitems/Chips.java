package com.pluralsight.orderitems;

public class Chips implements Interface {
    private String chipSelection;
    private double price;

    public Chips(String chipSelection) {
        this.chipSelection = chipSelection;
        this.price = price;
    }

    public String getChipSelection() {
        return chipSelection;
    }

    public void setChipSelection(String chipSelection) {
        this.chipSelection = chipSelection;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
