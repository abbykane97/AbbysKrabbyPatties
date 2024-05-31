package com.pluralsight.com.pluralsight;

import com.pluralsight.orderitems.Chips;
import com.pluralsight.orderitems.Drink;
import com.pluralsight.orderitems.Sandwich;

import java.util.ArrayList;
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
        this.sandwichList = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.chips = new ArrayList<>();

    }

    public List<Sandwich> getSandwichList() {
        return sandwichList;
    }

    {
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public List<Chips> getChips() {
        return chips;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }
    {
    }

    public void addSandwich(Sandwich sandwich) {
        sandwichList.add(sandwich);
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public void addChips(Chips chip) {
        chips.add(chip);
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
        this.orderTotal = totalCost;

        return totalCost;

    }
    }
