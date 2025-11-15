package basicMaths;

import java.util.Scanner;

public class PrintAllDivisors {

	public static void printDivisors(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		try {
			printDivisors(n);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Entered value is not a Number");
		}
		sc.close();
	}

}
