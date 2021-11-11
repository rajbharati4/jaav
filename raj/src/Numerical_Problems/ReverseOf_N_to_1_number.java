package Numerical_Problems;

import java.util.Scanner;

public class ReverseOf_N_to_1_number {

	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
		
		System.out.println("enter a number");
		int n=s.nextInt();
		
		
		for(int i=n; i>=1;i--)
		{
			System.out.println(i);
		}

	}

}
