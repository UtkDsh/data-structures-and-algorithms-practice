/*
Pattern
    *
   ***
  *****
 *******
*********
*********
 ******* 
  *****  
   ***   
    *  
  
  
 * 
 */

package patterns;

import java.util.Scanner;

public class Pattern9 {
	
	public static void printPattern9(int n)
	{
		Pattern7 p1=new Pattern7();
		Pattern8 p2=new Pattern8();
		p1.printPattern(n);
		p2.printPattern(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter upto which you want to print Pattern");
		int n=sc.nextInt();
		printPattern9(n);

	}

}
