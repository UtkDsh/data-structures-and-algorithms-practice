/*
Pattern 
123456
12345
1234
123
12
1  
  
 * 
 */

package patterns;

import java.util.Scanner;

public class Pattern6 {
	
	public static void printPattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<n-i+1;j++)
			{
				System.out.print(j+1);
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
