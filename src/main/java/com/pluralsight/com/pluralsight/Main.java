package com.pluralsight.com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Abby's Krabby Patties!");
        System.out.println("1. New Order");
        System.out.println("0. Exit");
        int choice = scanner.nextInt();
        if (choice == 1) {
            OrderScreen orderScreen = new OrderScreen();
            orderScreen.show();
        } else if (choice == 0) {
            System.out.println("Thank you for visiting. Goodbye!");
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }
        }


