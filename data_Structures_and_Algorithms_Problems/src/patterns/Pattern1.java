/* Pattern 1
 *****
 *****
 *****
 *****
 *****

 **/


package patterns;

import java.util.Scanner;

public class Pattern1 {
	
	public static void printPattern(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
//	public static void pr(int n)
//	{
//		for(int i=0;i<n;i++)
//		{
//			for(int j=0;j<n;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter upto which you want to print Pattern");
		int n=sc.nextInt();
		printPattern(n);
//		pr(n);
		
	}

}
