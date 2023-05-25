package com.tugas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Patient {
    private String name;
    private int age;
    private String address;

    public Patient(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}

public class Assignment8 {
    private static ArrayList<Patient> patients = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("Patients Data");
            System.out.println("================");
            System.out.println("1. Input New Data");
            System.out.println("2. View Patient's Data");
            System.out.println("3. Exit");
            System.out.print("Choose: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    inputNewData();
                    break;
                case 2:
                    viewPatientData();
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println();
        } while (choice != 3);
    }

    private static void inputNewData() {
        System.out.print("Input name [3-20]: ");
        String name = scanner.nextLine();

        System.out.print("Input age[>=10]: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Input address[5-30]: ");
        String address = scanner.nextLine();

        if (name.length() >= 3 && name.length() <= 20 && age >= 10 && age <= 100 && address.length() >= 5 && address.length() <= 30) {
            Patient patient = new Patient(name, age, address);
            patients.add(patient);
            System.out.println("Data has been successfully inserted!");
        } else {
            System.out.println("Invalid input! Data insertion failed.");
        }
    }

    private static void viewPatientData() {
        if (patients.isEmpty()) {
            System.out.println("No Data!");
            return;
        }

        System.out.println("Patients Data:");
        System.out.println("+------+----------------------+-----+-----------------------+");
        System.out.println("|  No  |        Name          | Age |        Address        |");
        System.out.println("+------+----------------------+-----+-----------------------+");

        for (int i = 0; i < patients.size(); i++) {
            Patient patient = patients.get(i);
            String row = String.format("| %4d | %20s | %3d | %21s |", i + 1, patient.getName(), patient.getAge(), patient.getAddress());
            System.out.println(row);
        }

        System.out.println("+------+----------------------+-----+-----------------------+");

        int subChoice;
        do {
            System.out.println("\nSort Data:");
            System.out.println("1. Sort Data by Name Ascending");
            System.out.println("2. Sort Data by Name Descending");
            System.out.println("3. Sort Data by Age Ascending");
            System.out.println("4. Sort Data by Age Descending");
            System.out.println("5. Back");
            System.out.print("Choose: ");

            subChoice = scanner.nextInt();
            scanner.nextLine();

            switch (subChoice) {
                case 1:
                    sortByAscendingName();
                    break;
                case 2:
                    sortByDescendingName();
                    break;
                case 3:
                    sortByAscendingAge();
                    break;
                case 4:
                    sortByDescendingAge();
                    break;
                case 5:
                    System.out.println("Going back to the main menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println();
        } while (subChoice != 5);
    }

    private static void sortByAscendingName() {
        Collections.sort(patients, Comparator.comparing(Patient::getName));
        System.out.println("Data sorted by Name (Ascending)!");
        displayPatientData();
    }

    private static void sortByDescendingName() {
        Collections.sort(patients, Comparator.comparing(Patient::getName, Comparator.reverseOrder()));
        System.out.println("Data sorted by Name (Descending)!");
        displayPatientData();
    }

    private static void sortByAscendingAge() {
        Collections.sort(patients, Comparator.comparingInt(Patient::getAge));
        System.out.println("Data sorted by Age (Ascending)!");
        displayPatientData();
    }

    private static void sortByDescendingAge() {
        Collections.sort(patients, Comparator.comparingInt(Patient::getAge).reversed());
        System.out.println("Data sorted by Age (Descending)!");
        displayPatientData();
    }

    private static void displayPatientData() {
        if (patients.isEmpty()) {
            System.out.println("No Data!");
            return;
        }

        System.out.println("Patients Data:");
        System.out.println("+------+----------------------+-----+-----------------------+");
        System.out.println("|  No  |        Name          | Age |        Address        |");
        System.out.println("+------+----------------------+-----+-----------------------+");

        for (int i = 0; i < patients.size(); i++) {
            Patient patient = patients.get(i);
            String row = String.format("| %4d | %20s | %3d | %21s |", i + 1, patient.getName(), patient.getAge(), patient.getAddress());
            System.out.println(row);
        }

        System.out.println("+------+----------------------+-----+-----------------------+");
    }
}
