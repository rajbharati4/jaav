package Collection;

import java.util.ArrayList;

public class C6 
{
	public static void main(String[] args)
	{
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		
		for(int i=0;i<a.size();i++)
		{
			System.out.print(a.get(i)+" ");
		}
	}

}
