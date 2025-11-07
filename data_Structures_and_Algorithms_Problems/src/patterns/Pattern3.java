/*
 Pattern
 1 
 1  2 
 1  2  3 
 1  2  3  4 
 1  2  3  4  5 
 
 * 
 */


package patterns;

import java.util.Scanner;

public class Pattern3 {
	
	public static void printPattern(int n)
	{
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+j+" ");
			}
			System.out.println();
		}
		
	}

//	public static void pr(int n)
//	{
//		for(int i=0;i<n;i++)
//		{
//			for(int j=0;j<i+1;j++)
//			{
//				System.out.print(j+1);
//			}
//			System.out.println();
//		}
//	}
//	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter upto which you want to print Pattern");
		int n=sc.nextInt();
		printPattern(n);
//		pr(n);

	}

}
