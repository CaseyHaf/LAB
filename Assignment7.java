package com.tugas;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        int[][] result = new int[3][3];

        System.out.println("Masukkan angka untuk matriks pertama: ");
        inputMatrixElements(matrix1, input);

        System.out.println("Masukkan angka untuk matriks kedua: ");
        inputMatrixElements(matrix2, input);

        addMatrices(matrix1, matrix2, result);

        System.out.println("Hasil penjumlahan matriks yaitu: ");
        printMatrix(result);
    }

    public static void inputMatrixElements(int[][] matrix, Scanner input) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Masukkan elemen (" + i + "," + j + "): ");
                matrix[i][j] = input.nextInt();
            }
        }
    }

    public static void addMatrices(int[][] matrix1, int[][] matrix2, int[][] result) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
