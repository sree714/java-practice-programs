package work22_05_21;

import java.util.Scanner;

public class Sum {
    int sum = 0;

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number:");
        n = s.nextInt();
        Sum obj = new Sum();
        int a = obj.add(n);
        System.out.println("Sum:" + a);
    }

    int add(int n) {
        sum = n % 10;
        if (n == 0) {
            return 0;
        } else {
            return sum + add(n / 10);
        }

    }
}