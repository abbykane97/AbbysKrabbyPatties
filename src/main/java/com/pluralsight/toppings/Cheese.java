package com.pluralsight.toppings;

import java.util.ArrayList;
import java.util.List;

public class Cheese extends Premium {
    public Cheese(String name, double price) {
        this(name, price, true);
    }

    public Cheese(String name, double price, boolean isPremium) {
        super(name, price, isPremium);
    }


    public static List<Cheese> generateCheeses() {
            List<Cheese> cheeses = new ArrayList<>();
            cheeses.add(new Cheese("American", 0.75));
            cheeses.add(new Cheese("Provolone", 0.75));
            cheeses.add(new Cheese("Cheddar", 0.75));
            cheeses.add(new Cheese("Swiss", 0.75));
            return cheeses;
        }
        }
