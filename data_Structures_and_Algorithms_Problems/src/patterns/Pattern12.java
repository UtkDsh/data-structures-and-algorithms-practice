/*
Pattern
1          1
12        21
123      321
1234    4321
12345  54321
123456654321
 
  
  
 * 
 */

package patterns;

import java.util.Scanner;

public class Pattern12 {
	
	public static void printPattern(int n)
	{
		int space=2*(n-1);
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
			space-=2;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter upto which you want to print Pattern");
		int n=sc.nextInt();
		printPattern(n);
		
	}

}
