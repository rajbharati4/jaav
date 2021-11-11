package Array;

import java.util.Scanner;

public class C2 
{
	public static int fact(int i)
	{
		int fact=1;
		for(int j=i; j>=1;j--)
		{
			fact=fact*j;	
		}
		return fact;
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		int [] a= new int[5];
		int sum=0;
		System.out.println("Enter the elements of the array");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("the factorial of given numbers of array is");
		for(int i=0;i<a.length;i++)
		{
			a[i]=fact(a[i]);
			System.out.println(a[i]+" ");
			
		}
		
	}

}
