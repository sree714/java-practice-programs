package work20_05_21;

import java.util.Scanner;

public class Lcm {
   public static void main(String args[]) {

      int c, d, a, b, temp, hcf, lcm;
      Scanner scanner = new Scanner(System.in);

      System.out.print(" 1st no: ");
      a = scanner.nextInt();
      System.out.print("2nd no: ");
      b = scanner.nextInt();

      c = a;
      d = b;

      while (d != 0) {
         temp = d;
         d = c % d;
         c = temp;
      }

      hcf = c;
      lcm = (a * b) / hcf;

      System.out.println("HCF of input numbers: " + hcf);
      System.out.println("LCM of input numbers: " + lcm);
   }
}