
import java.util.*;
import java.lang.*;
class Cube
{
	public static int sum(int n)
	{
		int sum = 0;
		for (int x=1; x<=n; x++)
			sum += x*x*x;
		return sum;
	}

	public static void main(String[] args)
	{
        System.out.println("enter the max number:");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println("sum of cubes :"+sum(n));
		//System.out.println(sum(n));

	}
}


