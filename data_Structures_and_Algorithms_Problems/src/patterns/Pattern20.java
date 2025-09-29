/*
 
Pattern

*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
  
  
  
 * 
 * 
 */

package patterns;

import java.util.Scanner;

public class Pattern20 {
	
	public static void printPattern(int n)
	{
		int spaces=2*n-2;
		for(int i=1;i<=2*n-1;i++)
		{
			int stars=i;
			if(i>n)
			{
				stars=2*n-i;
			}
			for(int j=1;j<=stars;j++)
			{
				System.out.print("*");
			}
			for(int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=stars;j++)
			{
				System.out.print("*");
			}
			if(i<n)
			{
				spaces-=2;
			}
			else
			{
				spaces+=2;
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter upto which you want to print Pattern");
		int n=sc.nextInt();
		printPattern(n);

	}

}
