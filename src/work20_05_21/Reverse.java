package work20_05_21;

import java.util.Scanner;

public class Reverse {
    public static void reverse(int number) {
        if (number < 10) {
            System.out.println(number);
            return;
        } else {
            System.out.print(number % 10);
            reverse(number / 10);
        }
    }

    public static void main(String args[]) {
        System.out.print("enter no: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("reverse : ");
        reverse(num);
    }
}
