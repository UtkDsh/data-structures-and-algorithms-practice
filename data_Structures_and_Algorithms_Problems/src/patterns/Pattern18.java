/*
Pattern

E
DE
CDE
BCDE
ABCDE

  
  
 * 
 */
package patterns;

import java.util.Scanner;

public class Pattern18 {

	public static void printPattern(int n)
	{
//		for(int i=0;i<n;i++)
//		{
//			char ch='E';
//			ch-=i;
//			for(int j=0;j<i+1;j++)
//			{
//				System.out.print(ch++);
//			}
//			System.out.println();
//		}
		
		for(int i=0;i<n;i++)
		{
			for(char ch=(char) ('E'-i);ch<='E';ch++)
			{
				System.out.print(ch);
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
