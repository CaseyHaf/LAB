package com.tugas;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice, quantity;
        double totalPrice, money, change;
        String itemName = "";
        double itemPrice = 0.0;

        System.out.println("ES Companies Portal - Cashier App 2");
        System.out.println("===================================");
        System.out.println("1. Keyboard - $49.99");
        System.out.println("2. Mouse - $19.99");
        System.out.println("3. Monitor - $99.99");
        System.out.println("4. Exit");

        System.out.print("Choose: ");
        choice = scanner.nextInt();

        System.out.print("Input quantity [1..20]: ");
        quantity = scanner.nextInt();

        if (quantity > 20) {
            System.out.println(" ");
            System.out.println("Out of stock!");
            System.out.println("Thanks for using this application ^^");
            System.exit(0);
        } else {
            switch (choice) {
                case 1:
                    itemName = "Keyboard";
                    itemPrice = 49.99;
                    break;
                case 2:
                    itemName = "Mouse";
                    itemPrice = 19.99;
                    break;
                case 3:
                    itemName = "Monitor";
                    itemPrice = 99.99;
                    break;
                case 4:
                    System.out.println("Thanks for using this application ^^");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    System.out.println("Thanks for using this application ^^");
                    System.exit(0);
                    break;
            }
        }
        totalPrice = itemPrice * quantity;

        System.out.println(" ");
        System.out.println("ES Companies Portal - Invoice");
        System.out.println("===============================");
        System.out.println("Item name: " + itemName);
        System.out.println("Price: $" + itemPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println(" ");
        System.out.printf("Total: $%.2f\n", totalPrice);

        System.out.printf("Input your money [min $%.2f]: $", totalPrice);
        money = scanner.nextDouble();

        if (money < totalPrice) {
            System.out.println("Not enough money!");
            System.out.println(" ");
            System.out.println("Thanks for using this application ^^");
            System.exit(0);
        } else {
            change = money - totalPrice;
            System.out.println("Thanks for purchasing!");
            System.out.printf("Your change: $%.2f\n", change);
            System.out.println(" ");
            System.out.println("Thanks for using this application ^^");
        }
        scanner.close();
    }
}
