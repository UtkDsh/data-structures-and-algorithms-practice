package patterns;

import java.util.Scanner;

public class Pattern10 {
	
	public static void printPattern(int n)
	{
		Pattern2 p1=new Pattern2();
		Pattern5 p2=new Pattern5();
		p1.printPattern(n);
		p2.printPattern(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter upto which you want to print Pattern");
		int n=sc.nextInt();
		printPattern(n);
		

	}

}
