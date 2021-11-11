package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class I2 
{
	public static void main (String[]args)
	{
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		ListIterator i = a.listIterator(4);
		
		while(i.hasPrevious())
		{
//			int temp=(Integer)i.previous();
//			i.remove();
//			System.out.print(i.next()+" ");
			System.out.print(i.previous());

		}
		System.out.println("hi");
		
	}
}


