package comparable;

import java.util.ArrayList;

public class C3 
{
	public static void main (String[]args)
	{
		ArrayList <Integer>a=new ArrayList<>();
		
		a.add(10);
		a.add(20);
		a.add(30);
		
		int sum=0;
		
		for(Integer i:a)
		{
			int temp=(Integer)i;
			sum=sum+temp;
		}
		System.out.println(sum);
	}

}
