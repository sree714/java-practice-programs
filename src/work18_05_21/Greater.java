package work18_05_21;

import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        int x, y, z;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter three numbers:");
        x = s.nextInt();
        y = s.nextInt();
        z = s.nextInt();
        if (x > y && x > z) {
            System.out.println("Greatest number :" + x);
        } else if (y > z) {
            System.out.println("Greatest number is:" + y);
        } else {
            System.out.println("Greatest number is:" + z);
        }

    }
}