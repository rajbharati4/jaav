package Numerical_Problems;
import java.util.Scanner;
public class Factor 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
        System.out.println("Enter a number to find its factors");
		
		int n=s.nextInt();
		
		System.out.println("the factors of"+n+" are:");
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i+" ");
			}
		}
	}

}
