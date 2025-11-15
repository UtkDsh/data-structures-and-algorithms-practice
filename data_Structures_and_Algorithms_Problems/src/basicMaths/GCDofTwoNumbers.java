package basicMaths;

import java.util.Scanner;

public class GCDofTwoNumbers {
	
	public static void calcualteGCD(int n1,int n2)
	{
		int gcd=0;
		for(int i=1;i<=(Math.min(n1, n2)/2);i++)
		{
			if(n1%i==0 && n2%i==0)
			{
				gcd=i;
			}
			
		}
		if(gcd!=0)
		{
			System.out.println("The GCD of the Numbers "+n1+" and "+n2 +" is "+gcd);
		}
		else
		{
			System.out.println("There is no common multiple of both the numbers");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int n1=sc.nextInt();
		System.out.println("Enter the second number");
		int n2=sc.nextInt();
		try {
			calcualteGCD(n1, n2);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Entered Values are not numbers");
		}
		sc.close();
	}
}
