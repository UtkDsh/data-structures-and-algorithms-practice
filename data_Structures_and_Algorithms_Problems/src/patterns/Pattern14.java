package patterns;

import java.util.Scanner;

public class Pattern14 {
	
	public static void printPattern(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(char ch='A';ch<='A'+i;ch++)
			{
				System.out.print(ch+" ");
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
