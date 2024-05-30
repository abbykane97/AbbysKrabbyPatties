package com.pluralsight.toppings;

import java.util.ArrayList;
import java.util.List;

public class Meat extends Premium {
    public Meat(String name, double price) {
        this(name, price, true);
    }
    public Meat(String name, double price, boolean isPremium) {
        super(name, price, isPremium);
    }

    public static List<Meat> generateMeats() {
        List<Meat> meats = new ArrayList<>();
        meats.add((new Meat("Steak", 1.0)));
        meats.add((new Meat("Ham", 1.0)));
        meats.add((new Meat("Salami", 1.0)));
        meats.add((new Meat("Roast Beef", 1.0)));
        meats.add((new Meat("Chicken", 1.0)));
        meats.add((new Meat("Bacon", 1.0)));
        return meats;
    }
}
