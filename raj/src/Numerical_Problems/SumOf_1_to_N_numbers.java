package Numerical_Problems;

import java.util.Scanner;

public class SumOf_1_to_N_numbers {

	public static void main(String[] args) {
		
        Scanner s=new Scanner(System.in);
		
		System.out.println("enter a number");
		int n=s.nextInt();
		int sum=0;
		
		for(int i=1; i<=n; i++)
		{
			sum+=i;
			
		}
		System.out.println(sum);	

	}

}
