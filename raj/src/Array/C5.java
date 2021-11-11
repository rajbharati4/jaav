package Array;

import java.util.Scanner;

public class C5 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		int [] a= new int[5];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		int j=a.length-1,k=0,temp=0;
		while(k<=j)
		{
			temp=a[k];
			a[k]=a[j];
			a[j]=temp;
			k++;
			j--;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}

}
