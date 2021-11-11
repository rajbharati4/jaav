package Numerical_Problems;

import java.util.Scanner;

public class Check_Even_Odd {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
			
			System.out.println("enter a number");
			int n=s.nextInt();
			if(n%2==0)
			{
				System.out.println("even no");
			}
			else
				System.out.println("odd no");

	}

}
