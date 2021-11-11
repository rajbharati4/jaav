package Array;
import java.util.Scanner;

public class BinarySearch 
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
		System.out.println("Enter the elements to be searched");
		int key=s.nextInt();
		int low=0;
		int high=size-1;
		while(high>=low)
		{
			int mid=(low+high)/2;
			if(a[mid]==key)
			{
				System.out.println("the element "+key +" has been found at index"+mid);
			   break;
			}
			else if(a[mid]>key)
			{
				high=mid-1;
			}
			else
				low=mid+1;
		}
		if(high<low)
		{
			System.out.println(" the element is not found");
		}
	}

}
