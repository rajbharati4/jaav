package Iterator;

import java.io.*;  
import java.util.*;  

public class I3 
{
	public static void main (String[]args)
	{
		ArrayList a=new ArrayList ();
		a.add("Messi");
		a.add("Ronaldo");
		a.add("Neymar");
		
		Iterator i=a.listIterator();
		
		while(i.hasNext())
		{
			//System.out.print(i.next()+" ");
			
			System.out.println(i.hasNext()+" ");
			
		}
		
	}

}



