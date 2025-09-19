/*
 Pattern
 
 * 
 *  * 
 *  *  * 
 *  *  *  * 
 *  *  *  *  * 
 

 
 */

package patterns;

import java.util.Scanner;

public class Pattern2 {
	
	public static void printPattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
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
