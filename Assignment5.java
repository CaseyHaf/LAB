package com.tugas;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        while (true) {
            System.out.print("Masukkan angka: ");
            num = scanner.nextInt();

            if (num == 0) {
                System.out.println("Keluar");
                break;
            } else {
                int factorial = 1;
                System.out.print("Perkalian faktorial adalah: ");
                for (int i = num; i >= 1; i--) {
                    System.out.print(i);
                    if (i != 1) {
                        System.out.print("x");
                    }
                    factorial *= i;
                }
                System.out.println();
                System.out.println("Hasilnya adalah: " + factorial);
            }
        }
        scanner.close();
    }
}