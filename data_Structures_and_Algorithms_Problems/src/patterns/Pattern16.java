/*
Pattern

A
BB
CCC
DDDD
EEEEE
  
 
 
 * 
 */


package patterns;

import java.util.Scanner;

public class Pattern16 {
	
	public static void printPattern(int n)
	{
		char ch='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(ch);
			}
			System.out.println();
			ch++;
		}
	
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter upto which you want to print Pattern");
		int n=sc.nextInt();
		printPattern(n);
				

	}

}
