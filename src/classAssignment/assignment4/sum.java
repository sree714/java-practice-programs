package classAssignment.assignment4;

import java.util.Scanner;

class sum
{
    // Driver code
    public static void main(String[] args)
    {
        int r1,c1,r2,c2;
        Scanner inp = new Scanner(System.in);
        r1 = inp.nextInt();
        c1 = inp.nextInt();
        r2 = inp.nextInt();
        c2 = inp.nextInt();
        int a[][] = new int[r1][c1];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                a[i][j]=inp.nextInt();
            }
        }
        int b[][] = new int[r2][c2];
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                b[i][j]=inp.nextInt();
            }
        }
        if(r1!=r2 && c1!=c2)
        {
            System.out.println("\nNot identical matrices");
        }
        else
        {
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c1;j++)
                {
                    if(a[i][j]!=b[i][j])
                    {
                        System.out.println("\nNot identical matrices");
                        return;
                    }
                }
            }
            System.out.println("\nIdentical matrices");
        }
    }
}