package basicMaths;

import java.util.Scanner;

public class CheckArmstrongNumber {
	
	public static void CheckArmStrong(int n)
	{
		int num=n;
		int length=0;
		while(num>0)
		{
			length++;
			num=num/10;
		}
		num=n;
		int sum=0;
		int digit=0;
		while(num>0)
		{
			digit=num%10;
			sum+=Math.pow(digit,length);
			num=num/10;
		}
		if(sum==n)
		{
			System.out.println("The Number is an Armstrong Number");
		}
		else
		{
			System.out.println("The Number is not an Armstrong Number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		try {
			int n=sc.nextInt();
			CheckArmStrong(n);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Entered Value is not a Number");
		}

		sc.close();
	}

}
