package com.algo.problems.array;

import java.util.LinkedList;

public class MatrixRotation {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        rotate90Clockwise(matrix);
        printMatrix(matrix);
    }

    public static void rotate90Clockwise(int[][] matrix) {
        transpose(matrix);
        reverseRows(matrix);
    }

    public static void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void reverseRows(int[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        for (int i = 0; i < numRows; i++) {
            int left = 0;
            int right = numCols - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            list.r
            System.out.println();
        }
    }
}

