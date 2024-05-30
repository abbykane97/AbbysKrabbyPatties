package com.pluralsight.orderitems;

import com.pluralsight.com.pluralsight.Interface;

public class Chips implements Interface {
    private String chipSelection;

    public Chips(String chipSelection) {
        this.chipSelection = chipSelection;
    }

    public String getChipSelection() {
        return chipSelection;
    }

    public void setChipSelection(String chipSelection) {
        this.chipSelection = chipSelection;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
