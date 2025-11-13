package basicMaths;

import java.util.Scanner;

public class CheckPallindrome {
	
	public static void PallindromeCheck(int n)
	{
		int num=n;
		int rev=0;
		int digit=0;
		while(num>0)
		{
			digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		if(rev==n)
		{
			System.out.println("The Number is a Pallindrome Number");
		}
		else
		{
			System.out.println("The Number is not a Pallindrome Number");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		try {
			int n=sc.nextInt();
			PallindromeCheck(n);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Entered Value is not a Number");
		}
		sc.close();

	}

}
