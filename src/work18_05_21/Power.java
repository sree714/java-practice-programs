package work18_05_21;

import java.util.Scanner;
class Power
{
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
     System.out.println("Enter base");
     int x=sc.nextInt();
     System.out.println("Enter exponent");
     int y=sc.nextInt();
     System.out.println("Power("+x+"^"+y+") = "+power(x,y));
 
    	}
 
 static int power(int b,int e)
 {
 if(e==0)
         return 1;
     else 
         return (b*power(b,e-1)); 
 }
}