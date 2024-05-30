package com.pluralsight.com.pluralsight;

import com.pluralsight.orderitems.Chips;
import com.pluralsight.orderitems.Drink;
import com.pluralsight.orderitems.Sandwich;
import com.pluralsight.toppings.Cheese;
import com.pluralsight.toppings.Meat;
import com.pluralsight.toppings.Regular;

import java.util.Scanner;
import java.util.List;

public class OrderScreen {
    private Scanner scanner;
    private OrderManager orderManager;

    public OrderScreen() {
        this.scanner = new Scanner(System.in);
        this.orderManager = new OrderManager();
    }
    public void show() {
        Order order = new Order();
        while (true) {
            System.out.println("Order Screen:");
            System.out.println("1. Add Sandwich");
            System.out.println("2. Add Drink");
            System.out.println("3. Add Chips");
            System.out.println("4. Checkout");
            System.out.println("0. Cancel Order");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    order.addSandwich(createSandwich());
                    break;
                case 2:
                    order.addDrink(createDrink());
                    break;
                case 3:
                    order.addChips(createChips());
                    break;
                case 4:
                    orderManager.addOrder(order);
                    orderManager.addOrder(order);
                    order.generateReceipt();
                    System.out.println("Order completed. Your total cost is: $" + order.calculateTotalCost());
                    return;
                case 0:
                    System.out.println("Order cancelled");


            }
        }
    }
    private Sandwich createSandwich() {
        System.out.println("Enter bread type:");
        String breadType = scanner.next();
        System.out.println("Enter size (4/8/12 inches):");
        int size = scanner.nextInt();
        System.out.println("Is it toasted? (true/false):");
        boolean isToasted = scanner.nextBoolean();

        Sandwich sandwich = new Sandwich(breadType, size, isToasted);

        while (true) {
            System.out.println("Add topping (1. Meat, 2. Cheese, 3. Regular, 0. Done):");
            int choice = scanner.nextInt();
            if (choice == 0) {
                break;
            }
            System.out.println("Enter topping name:");
            String toppingName = scanner.next();
            System.out.println("Enter topping price:");
            double toppingPrice = scanner.nextDouble();
            System.out.println("Is it premium? (true/false):");
            boolean isPremium = scanner.nextBoolean();
            if (choice == 1) {
                sandwich.addTopping(new Meat(toppingName, toppingPrice, isPremium));
            } else if (choice == 2) {
                sandwich.addTopping(new Cheese(toppingName, toppingPrice, isPremium));
            } else {
                sandwich.addTopping(new Regular(toppingName, toppingPrice, isPremium));
            }
        }

        return sandwich;
    }

    private Drink createDrink() {
        System.out.println("Enter size (small/medium/large):");
        String size = scanner.next();
        System.out.println("Enter drink selection:");
        String drinkSelection = scanner.next();

        return new Drink(size, drinkSelection);
    }

    private Chips createChips() {
        System.out.println("Enter chip selection:");
        String chipSelection = scanner.next();

        return new Chips(chipSelection);
    }
}

