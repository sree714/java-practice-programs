package work24_05_21;

import java.math.BigInteger;

public class BigFactorial {
    public static void main(String args[]) {

        System.out.printf("Factorial of 45 is %s %n", factorial(100));
    }

    public static BigInteger factorial(int number) {
        BigInteger factorial = BigInteger.ONE;

        for (int i = number; i > 0; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        return factorial;
    }

}