package Array;
import java.util.Scanner;

public class C1 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		int [] a= new int[5];
		int sum=0;
		System.out.println("Enter the elements of the array");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
			sum=sum+a[i];
		}
		System.out.println("the sum of elements of"+sum);
	}

}
