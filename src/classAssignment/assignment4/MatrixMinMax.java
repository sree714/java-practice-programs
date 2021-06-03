package classAssignment.assignment4;

import java.util.Scanner;

//7. Write a Java program to find the maximum and minimum value of a Matrix.
public class MatrixMinMax {

    public static void main(String[] args) {
        int rows;
        int columns;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        rows = scanner.nextInt();

        System.out.println("Enter number of columns: ");
        columns = scanner.nextInt();

        int[][] matrix = new int [rows][columns];

        System.out.println("Enter matrix numbers: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        System.out.println("Matrix as entered");
        for (int i = 0; i < matrix .length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
        findMinMax(matrix);
    }

    private static void findMinMax(int[][] matrix){
        int maxNum = matrix[0][0];
        int minNum = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(maxNum < matrix[i][j]){
                    maxNum = matrix[i][j];
                }else if(minNum > matrix[i][j]){
                    minNum = matrix[i][j];
                }
            }
        }
        System.out.println("Largest number: " + maxNum + " Smallest number: " + minNum);
    }
}