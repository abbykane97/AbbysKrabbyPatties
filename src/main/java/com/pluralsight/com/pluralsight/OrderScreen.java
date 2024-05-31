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
                    order.setOrderTotal(order.calculateTotalCost());
                    ReceiptManager receiptManager = new ReceiptManager();
                    receiptManager.generateReceipt(order);
                    System.out.println("Order completed. Your total cost is: $" + order.calculateTotalCost());
                    return;
                case 0:
                    System.out.println("Order cancelled");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
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
            switch (choice) {
                case 1:
                    addMeatTopping(sandwich);
                    break;
                case 2:
                    addCheeseTopping(sandwich);
                    break;
                case 3:
                    addRegularTopping(sandwich);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        return sandwich;
    }

    private void addMeatTopping(Sandwich sandwich) {
        System.out.println("Meat options:");
        List<Meat> meats = Meat.generateMeats();
        for (int i = 0; i < meats.size(); i++) {
            System.out.println((i + 1) + "." + meats.get(i).getName());
        }
        int meatChoice = scanner.nextInt();
        sandwich.addTopping(meats.get(meatChoice - 1));
    }

    private void addCheeseTopping(Sandwich sandwich) {
        System.out.println("Cheese options:");
        List<Cheese> cheeses = Cheese.generateCheeses();
        for (int i = 0; i < cheeses.size(); i++) {
            System.out.println((i + 1) + "." + cheeses.get(i).getName());
        }
        int cheeseChoice = scanner.nextInt();
        sandwich.addTopping(cheeses.get(cheeseChoice - 1));
    }

    private void addRegularTopping(Sandwich sandwich) {
        System.out.println("Regular Topping options:");
        List<Regular> regulars = Regular.generateRegularToppings();
        for (int i = 0; i < regulars.size(); i++) {
            System.out.println((i + 1) + "." + regulars.get(i).getName());
        }
        int regularChoice = scanner.nextInt();
        sandwich.addTopping(regulars.get(regularChoice - 1));
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

