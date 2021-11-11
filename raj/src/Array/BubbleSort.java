package Array;
import java.util.Scanner;

public class BubbleSort 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the size of the array");
		int size=s.nextInt();
		int[] a=new int[size];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("the array before sorting:");
		for(int i:a)
		{
			System.out.println(i+" ");
		}
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<size-i-1;j++)
			{
			if (a[j]>=a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
			}
		}
		System.out.println("the sorted array is");
		for(int i:a)
		{
			System.out.println(i+" ");
		}
					
			
		}
	}


