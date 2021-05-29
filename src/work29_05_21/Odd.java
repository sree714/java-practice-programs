package work29_05_21;

import java.util.*;

public class Odd {

    public static void main(String[] args) {
        int n;
        System.out.println("how many elemets?");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count_odd = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0)
                count_odd++;
        }
        System.out.println("No of odd elements:" + count_odd);


    }
}

