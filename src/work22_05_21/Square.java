import java.util.*;
class Square
{
static int sum=0;
public static void main(String args[])
{
int n=0;
System.out.println("enter the number");
Scanner sc= new Scanner(System.in);
n=sc.nextInt();
int k=sumSq(n);
System.out.println("sum of suqare "+n+" is :"+k);
}
static int sumSq(int n)
{
 if(n>0)
 {
 int d=n%10;
 sum=sum+d*d;  
 return(sumSq(n/10));
 }
  else
 {
 return sum;
 }
}
}
