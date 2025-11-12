//Time Complexity of Counting digits is O( Log10(N) )
package basicMaths;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CountDigits {
	
	public static void CountNoOfDigits(int n)
	{
		int counter=0;
		while(n>0)
		{
			n=n/10;
			counter++;
		}
		System.out.println("The number of Digits are "+counter);
	}
	
	public static void CountDigitsByLogarithmicFunction(int n)
	{
		int count=(int) (Math.log10(n)+1);
		System.out.println("The Number of Digits By Logarithmic Function are "+count);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		try {
			int n=sc.nextInt();
			CountNoOfDigits(n);
			CountDigitsByLogarithmicFunction(n);
			
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Entered Value is not a Number");
		}
		
		sc.close();
	}

}
