package com.tugas;

import java.util.Scanner;

public class Assignment3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ES Companies Portal - Cashier App");
        System.out.println("==========================");
        System.out.print("Input items name: ");
        String itemName = scanner.nextLine();
        System.out.print("Input items price (use decimal numbers): $");
        double itemPrice = scanner.nextDouble();
        System.out.print("Input items quantity [1..20]: ");
        int itemQuantity = scanner.nextInt();
        System.out.print("Input items discount [0..50]: ");
        int itemDiscount = scanner.nextInt();

        double totalPrice = itemPrice * itemQuantity * (100 - itemDiscount) / 100;
        System.out.println(" ");
        System.out.println("ES Companies Portal - Invoice");
        System.out.println("=======================");
        System.out.println("Items name: " + itemName);
        System.out.println("Items price: $" + itemPrice);
        System.out.println("Items quantity: " + itemQuantity);
        System.out.println("Items discount: " + itemDiscount + "%");
        System.out.println(" ");
        System.out.println("You have to pay: $" + totalPrice);
        System.out.println(" ");

        System.out.print("Input your money (use decimal numbers): $");
        double paymentAmount = scanner.nextDouble();

        double change = paymentAmount - totalPrice;
        System.out.println(" ");
        System.out.println("Thanks for purchasing!");
        System.out.println("Your change: $" + change);

        scanner.close();
    }
}
