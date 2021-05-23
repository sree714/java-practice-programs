package work22_05_21;

import java.util.Scanner;
public class Convert {
 public static void main(String[] args) 
 {
  Scanner sc = new Scanner(System.in);
  long b, d = 0, j = 1, r;
  System.out.print("Input a binary number: ");
  b = sc.nextLong();

  while (b!= 0) 
  {
   r= b % 10;
   d = d + r * j;
   j = j * 2;
   b = b / 10;
  }
  System.out.println("Decimal Number: " + d);
 }
}
