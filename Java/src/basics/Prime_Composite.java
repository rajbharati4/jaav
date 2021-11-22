package basics;

import java.util.Scanner;

public class Prime_Composite {

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		System.out.println("Enter a number to check if it is a prime no or not");
		
		int n=s.nextInt();
		int count=0;
		
		if(n==0||n==1)
		{
			System.out.println("Not a prime no or composite no");
		}
		else
		{
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					count ++;
					System.out.println("It is a composite no");
					break;
				}
			}

		if(count==0)
		{
			System.out.println(n+" is a prime no ");
		}
		}
	}
}
