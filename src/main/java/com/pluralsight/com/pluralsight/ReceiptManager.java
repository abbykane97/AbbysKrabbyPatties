package com.pluralsight.com.pluralsight;

import com.pluralsight.orderitems.Chips;
import com.pluralsight.orderitems.Drink;
import com.pluralsight.orderitems.Sandwich;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptManager {
    private final String receipts_folder = "receipts/";

    public void generateReceipt(Order order) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        String timestamp = LocalDateTime.now().format(formatter);
        String filename = receipts_folder + timestamp + ".txt";

        File folder = new File(receipts_folder);

        if (!folder.exists()) {
            boolean created = folder.mkdir();

            if (!created) {
                System.out.println("Failed");
                return;
            }
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println("Order Time: " + timestamp);
            writer.println("----------");
            writer.println("Sandwiches:");

            for (Sandwich sandwich : order.getSandwichList()) {
                writer.println("-" + sandwich.getBreadType() + "-$" + sandwich.calculatePrice());
            }

            writer.println("Drinks:");
            for (Drink drink : order.getDrinks()) {
                writer.println("- " + drink.getSize() + drink.getDrinkSelection() + "-$" + drink.getPrice());
            }
            writer.println("Chips:");
            for (Chips chips : order.getChips()) {
                writer.println("- " + chips.getChipSelection() + " - $" + chips.getPrice());
            }

            writer.println("--------------");
            writer.println("Total Cost: $" + order.getOrderTotal());

            System.out.println("Receipt generated successfully: " + filename);

        } catch (IOException e) {
            System.out.println("Failed to generate receipt: " + e.getMessage());

        }
    }
        }

