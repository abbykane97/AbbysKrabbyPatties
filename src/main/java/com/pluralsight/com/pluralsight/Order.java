package com.pluralsight.com.pluralsight;

import com.pluralsight.orderitems.Chips;
import com.pluralsight.orderitems.Drink;
import com.pluralsight.orderitems.Sandwich;

import java.util.List;

public class Order {
    private List<Sandwich> sandwichList;
    private List<Drink> drinks;
    private List<Chips> chips;
    private double orderTotal;

    public Order(List<Sandwich> sandwichList, List<Drink> drinks, List<Chips> chips, double orderTotal) {
        this.sandwichList = sandwichList;
        this.drinks = drinks;
        this.chips = chips;
        this.orderTotal = orderTotal;

    }

    public List<Sandwich> getSandwichList() {
        return sandwichList;
    }

    public void setSandwichList(List<Sandwich> sandwichList) {
        this.sandwichList = sandwichList;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
    }

    public List<Chips> getChips() {
        return chips;
    }

    public void setChips(List<Chips> chips) {
        this.chips = chips;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }
}
