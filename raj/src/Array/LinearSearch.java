package Array;
import java.util.Scanner;

public class LinearSearch 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=s.nextInt();
		
		int[] a=new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();	
		}
		
	
	System.out.println("Enter an element to search");
	int key=s.nextInt();
	int found=0;
	for(int i=0;i<a.length;i++)
	{
		if(key==a[i])
		{
			found=1;
			System.out.println("The element "+ key + " is found at index");
			break;
		}
	}
	if(found==0)
	{
		System.out.println("The element is not present");
	}
	}
	
}
