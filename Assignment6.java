package com.tugas;

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Exit");
            System.out.print("Pilih Operasi Bilangan: ");
            int choice = scanner.nextInt();

            if (choice != 3) {
            System.out.println("Masukkan 4 angka:");            
                int[] angka = new int[4];
                for (int i = 0; i < 4; i++) {
                    System.out.print("Angka ke-" + (i + 1) + ": ");
                    angka[i] = scanner.nextInt();
                }

                switch (choice) {
                    case 1:
                        int hasilPenjumlahan = 0;
                        for (int i = 0; i < 4; i++) {
                            hasilPenjumlahan += angka[i];
                        }
                        System.out.println("Hasil penjumlahan: " + hasilPenjumlahan);
                        break;
                    case 2:
                        int hasilPengurangan = angka[0];
                        for (int i = 1; i < 4; i++) {
                            hasilPengurangan -= angka[i];
                        }
                        System.out.println("Hasil pengurangan: " + hasilPengurangan);
                        break;
                    default:
                        System.out.println("Masukkan angka 1/2/3");
                }
            } else {
                System.out.println("Exit");
                break;
            }
        }
        scanner.close();
    }
}