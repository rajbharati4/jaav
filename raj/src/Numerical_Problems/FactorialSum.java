package Numerical_Problems;

import java.util.Scanner;

public class FactorialSum {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter a no ");
		int a=s.nextInt();
		int sum=0;
	
		while(a>0)
		{
			int d=a%10;
			int fact=1;
			
			for(int i=d; i>=1; i--)
			{
			  fact=fact*i;
		    }
			sum=sum+fact;
			a=a/10;
			System.out.println(fact);
		}
		
	System.out.println(sum);
			

	}

}
