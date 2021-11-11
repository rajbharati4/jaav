package comparable;

import java.util.ArrayList;

public class C2 
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
				sum=sum+i;
			}
			System.out.println(sum);
		}

}
