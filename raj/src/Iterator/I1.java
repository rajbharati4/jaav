package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
public class I1 
{
	public static void main (String[]args)
	{
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		Iterator i=a.listIterator();
		
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		
	}

}
