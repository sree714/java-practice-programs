
import java.util.*;

class Natural {


static void PrintReverseOrder(int n)
{

	for (int i = n; i > 0; i--)
		System.out.println( +i + " ");
}

public static void main(String[] args)
{
    System.out.println("enter the max number:");
    Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
    System.out.println("Reverse order:");

	PrintReverseOrder(n);
}
}

