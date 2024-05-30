package com.pluralsight.toppings;

import java.util.ArrayList;
import java.util.List;

public class Regular extends Topping{
    public Regular(String name, double price, boolean isPremium) {
        super(name, price, false);

    }
    public static List <Regular> generateRegularToppings() {
        List<Regular> regulars = new ArrayList<>();
        regulars.add(new Regular("Lettuce", 0.0, false));
        regulars.add(new Regular("Peppers", 0.0, false));
        regulars.add(new Regular("Onions", 0.0, false));
        regulars.add(new Regular("Tomatoes", 0.0, false));
        regulars.add(new Regular("Jalapenos", 0.0, false));
        regulars.add(new Regular("Cucumbers", 0.0, false));
        regulars.add(new Regular("Pickles", 0.0, false));
        regulars.add(new Regular("Mushrooms", 0.0, false));
        regulars.add(new Regular("Mayo", 0.0, false));
        regulars.add(new Regular("Mustard", 0.0, false));
        regulars.add(new Regular("Ketchup", 0.0, false));
        regulars.add(new Regular("Ranch", 0.0, false));
        regulars.add(new Regular("Thousand Islands", 0.0, false));
        regulars.add(new Regular("Vinaigrette", 0.0, false));
        regulars.add(new Regular("Au Jus", 0.0, false));
        regulars.add(new Regular("Sauce", 0.0, false));
        return regulars;
    }
}
