package work15_05_21;
import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Prime ob = new Prime();
        ob.prime(7);
    }

    private void prime(int n) {
        int i, m = 0, flag = 0;
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println("the number " + n + " is not prime");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println("the number " + n + " is not prime");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("the number " + n + " is prime");
            }
        }
    }

}
