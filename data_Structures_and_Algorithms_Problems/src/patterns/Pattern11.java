package patterns;

import java.util.Scanner;

public class Pattern11 {
	
	public static void printPattern(int n)
	{
		int begin=1;
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				begin=1;
			}
			else
			{
				begin=0;
			}
			for(int j=0;j<=i;j++)
			{				
				System.out.print(begin);	
				begin=1-begin;
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
