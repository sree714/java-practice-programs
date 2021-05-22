package work18_05_21;

import java.util.Scanner;

public class Natural{
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int number, i;
		sc = new Scanner(System.in);
		
		System.out.print("  Enter Maximum Value : ");
		number = sc.nextInt();	
		
		for(i = number; i >= 1; i--)
		{
			System.out.println(i); 
		}	
	}
}