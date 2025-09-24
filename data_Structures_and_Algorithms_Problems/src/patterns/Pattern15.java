/*
Pattern
ABCDE
ABCD
ABC
AB
A

 
 * 
 */


package patterns;

import java.util.Scanner;

public class Pattern15 {

	public static void printPattern(int n)
	{

		for(int i=0;i<n;i++)
		{
			for(char ch='A';ch<='A'+n-i-1;ch++)
			{
				System.out.print(ch);
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
