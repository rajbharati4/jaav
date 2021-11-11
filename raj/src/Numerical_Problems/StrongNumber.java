package Numerical_Problems;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		int a=sc.nextInt();
		int sum=0;
		int temp=a;
		   
		    for(int i=1; i<=a;i--)
		    {
		      int fact=1;
			  fact=fact*i;
			  sum=sum+fact;
		    }
		
		if(temp==sum)
		{
			System.out.println("Strong no");
		}
		else
			System.out.println("not a strong no");
	}

}
