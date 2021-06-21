package Hackerrank;
import java.io.*;
import java.util.*;

interface AdvancedArithmetic
{
    int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic
{
    public  void display()
    {
        System.out.println("I implemented: AdvancedArithmetic");
    }

    public  int divisorSum(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        return (sum);
    }
}
public class Solution1 {


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Calculator c=new Calculator();
        c.display();
        System.out.println(c.divisorSum(n));
    }
}
