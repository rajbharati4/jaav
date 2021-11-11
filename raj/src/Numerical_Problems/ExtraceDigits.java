package Numerical_Problems;

import java.util.Scanner;

public class ExtraceDigits {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter no to extract its digits");
		int a=s.nextInt();
		
		while(a>0)
		{
			int d= a%10;
			a=a/10;
			System.out.print(d);	
		}
		
		

	}

}
