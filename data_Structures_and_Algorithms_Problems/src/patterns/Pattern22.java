/*
Pattern

4444444
4333334
4322234
4321234
4322234
4333334
4444444 
  
  
 Solution:
 considering n=4
 Here we first created a new matrix by subtracting each value by 4 i.e 'n'
 and then we subtract this new matrix from the desired matrix and hence we get 
 the desired Matrix.
  
 * 
 */


package patterns;


import java.util.Scanner;

public class Pattern22 {
	
	public static void printPattern(int n)
	{
		for(int i=0;i<2*n-1;i++)
		{
			for(int j=0;j<2*n-1;j++)
			{
				int top=i;
				int left=j;
				int right=(2*n-2)-j;
				int down=(2*n-2)-i;
				System.out.print(n-Math.min(Math.min(top, down),Math.min(left, right)));
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
