package patterns;

import java.util.Scanner;

public class Pattern17 {
	
	public static void printPattern(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				System.out.print(" ");
			}
			char ch='A';
			int breakPoint=(2*i+1)/2;
			for(int j=1;j<=2*i+1;j++)
			{
				
				System.out.print(ch);
				if(j<=breakPoint)
				{
					ch++;
				}
				else
				{
					ch--;
				}}
				for(int j=0;j<n-i-1;j++)
				{
					System.out.print(" ");
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
