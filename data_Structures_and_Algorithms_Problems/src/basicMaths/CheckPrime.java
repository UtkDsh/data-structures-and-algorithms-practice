package basicMaths;

import java.util.Scanner;

public class CheckPrime {
	
	public static void checkPrimeNumber(int n)
	{
		int flag=0;
		if(n>1)
		{		
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				System.out.println("The number is not a Prime Number");				
			}
			else
			{
				System.out.println("The number is a prime Number");
			}		
		}
		else if(n<=1)
		{
			System.out.println("The number is not a Prime Number");
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		try {
			int n=sc.nextInt();
			checkPrimeNumber(n);
			
		} catch (Exception e) {
			
			System.out.println("Entered Value is not a Number");
		}
	sc.close();	
	}

}
