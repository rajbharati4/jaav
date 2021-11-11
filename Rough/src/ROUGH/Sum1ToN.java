package ROUGH;

import java.util.Scanner;

public class Sum1ToN {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a no");
		int n=sc.nextInt();
		int sum =0;
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
			sum=sum+i;
		}
		System.out.println(sum);
		for(int i=n;i>=1;i--)
		{
			System.out.println(i);
		}

	}

}
