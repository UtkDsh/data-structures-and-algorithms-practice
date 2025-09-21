/*
Pattern
      *
     ***
    *****
   *******
  *********
 ***********
************* 
   
 * 
 */

package patterns;

import java.util.Scanner;

public class Pattern7 {
	
	public static void printPattern(int n)
	{
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<2*i+1;j++)
			{
				System.out.print("*");
			}
			for(int j=0;j<n-i-1;j++)
			{
				System.out.print("");
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
