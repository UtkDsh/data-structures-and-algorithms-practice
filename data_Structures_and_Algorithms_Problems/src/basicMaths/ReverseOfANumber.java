package basicMaths;

import java.util.Scanner;

public class ReverseOfANumber {

	public static void FindReverseOfNumber(int n)
	{
		int digit=0;
		int rev=0;
		while(n>0)
		{
			digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		System.out.println("The Reverse of the Number is "+rev);
		
	}
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		try {
			int n=sc.nextInt();
			FindReverseOfNumber(n);
		} catch (Exception e) {
		
			System.out.println("Entered Value is not a Number");
		}
		sc.close();
	}

}
