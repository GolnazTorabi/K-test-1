package com.company;

public class Main {
    public static int[][] matrix = {
            {0, 1, 2, 3, 4, 25},
            {5, 6, 7, 8, 9, 26},
            {10, 11, 12, 13, 14, 27},
            {15, 16, 17, 18, 19, 28},
            {20, 21, 22, 23, 24, 29},
            {30, 31, 32, 33, 34, 35}
    };

    private static void TraverseMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            StringBuilder buffer = new StringBuilder();
            for (int j = 0; j < i + 1; j++) {
                int k = matrix[i].length - i + j - 1;
                buffer.append(matrix[j][k]);
                buffer.append(' ');
            }
            System.out.println(buffer.toString());
        }

        for (int i = 0; i < matrix.length; i++) {
            StringBuilder buffer = new StringBuilder();
            for (int j = 0; j < matrix.length - i - 1; j++) {
                int k = 1 + i + j;
                buffer.append(matrix[k][j]);
                buffer.append(' ');
            }
            System.out.println(buffer.toString());
        }
    }

    public static void main(String[] args) {
        TraverseMatrix(matrix);
    }
}
