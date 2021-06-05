package classAssignment.assignment4;

import java.util.Scanner;

//10. Write a Java program to check two matrices are Identical or not.
class Identical {
    public static void main(String[] args) {
        int r1, c1, r2, c2;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of first matrix");
        r1 = inp.nextInt();
        c1 = inp.nextInt();
        System.out.println("Enter the number of rows and columns of second matrix");
        r2 = inp.nextInt();
        c2 = inp.nextInt();

        System.out.println("Enter elements of first matrix");
        int a[][] = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = inp.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix");
        int b[][] = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = inp.nextInt();
            }
        }

        if (r1 != r2 && c1 != c2) {
            System.out.println("\nNot identical matrices");
        } else {
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    if (a[i][j] != b[i][j]) {
                        System.out.println("\nNot identical matrices");
                        return;
                    }
                }
            }
            System.out.println("\nIdentical matrices");
        }
    }
}