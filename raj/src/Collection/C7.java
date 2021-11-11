package Collection;

import java.util.ArrayList;

public class C7 
{
	public static void main(String[] args)
	{
		ArrayList a=new ArrayList();
		a.add(2);
		a.add(3);
		a.add(5);
		a.add(7);
		
		int sum=0;
		
		for(Object o:a)
		{
			int temp=(Integer)o;
			sum=sum+temp;
		}
		System.out.print(sum);
	}

}
