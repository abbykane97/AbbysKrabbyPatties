package com.pluralsight.com.pluralsight;

import com.pluralsight.orderitems.Chips;
import com.pluralsight.orderitems.Drink;
import com.pluralsight.orderitems.Sandwich;

import java.util.Date;
import java.util.List;

public class Order {
    private List<Sandwich> sandwichList;
    private List<Drink> drinks;
    private List<Chips> chips;
    private double orderTotal;
    private Date orderTime;

    public Order(List<Sandwich> sandwichList, List<Drink> drinks, List<Chips> chips, double orderTotal, Date orderTime) {
        this.sandwichList = sandwichList;
        this.drinks = drinks;
        this.chips = chips;
        this.orderTotal = orderTotal;
        this.orderTime = orderTime;

    }

    public Order() {

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

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public void addSandwich(Sandwich sandwich) {
    }

    public void addDrink(Drink drink) {
    }

    public void addChips(Chips chips) {
    }

    public void generateReceipt() {
    }

    public double calculateTotalCost() {
        double totalCost = 0;

        for (Sandwich sandwich : sandwichList) {
            totalCost += sandwich.calculatePrice();
        }
        for (Drink drink : drinks) {
            totalCost += drink.getPrice();
        }
        for (Chips chip : chips) {
            totalCost += chip.getPrice();
        }

        return totalCost;

    }
}
