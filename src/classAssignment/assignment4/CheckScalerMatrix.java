package classAssignment.assignment4;

import java.util.Scanner;

public class CheckScalerMatrix {

    //2. Write a Java program to Check whether a Matrix is a Scalar Matrix or not.
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int row_size, col_size;
        System.out.print("Enter the row Size Of the Matrix:");
        row_size = cs.nextInt();
        System.out.print("Enter the columns Size Of the Matrix:");
        col_size = cs.nextInt();

        int matrix[][] = new int[row_size][col_size];

        int i, j;
        System.out.println("Enter the Matrix Element:");
        for (i = 0; i < row_size; i++) {
            for (j = 0; j < col_size; j++) {
                matrix[i][j] = cs.nextInt();
            }
        }

        int point = 0;
        for (i = 0; i < row_size; i++) {
            for (j = 0; j < col_size; j++) {
                if (i != j && matrix[i][j] != 0) {
                    point = 1;
                    break;
                }
                if (i == j && matrix[i][j] != matrix[i][j]) {
                    point = 1;
                    break;
                }
            }
        }
        if (point == 1)
            System.out.print("Given Matrix is not a Scaler Matrix.");
        else
            System.out.print("Given Matrix is a Scaler Matrix.");
        cs.close();
    }
}