/*
Patter
************
*****  *****
****    ****
***      ***
**        **
*          *
*          *
**        **
***      ***
****    ****
*****  *****
************ 
   
  
 * 
 */

package patterns;

import java.util.Scanner;

public class Pattern19 {
	
	public static void printPattern(int n)
	{
			//For Upper Part of Pattern
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n-i;j++)
				{
					System.out.print("*");
				}
				for(int j=0;j<2*i;j++)
				{
					System.out.print(" ");
				}
				for(int j=0;j<n-i;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			
			
			//For Lower Part of Pattern
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<i+1;j++)
				{
					System.out.print("*");
				}
				for(int j=0;j<(2*(n-i)-2);j++)
				{
					System.out.print(" ");
				}
				for(int j=0;j<i+1;j++)
				{
					System.out.print("*");
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
