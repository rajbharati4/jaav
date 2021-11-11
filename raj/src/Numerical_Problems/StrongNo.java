package Numerical_Problems;

import java.util.Scanner;

public class StrongNo {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter a no ");
		int a=s.nextInt();
		int sum=0;
		int temp=a;
		while(a>0)
		{
			int d=a%10;
			int fact=1;
			
			for(int i=d;i>=2;i--)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			a=a/10;
		}
		if(temp==sum)
		{
			System.out.println("Strong no");
		}
		else
			System.out.println("no a strong no");

	}

}
