package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class C3 
{
	public static void main(String[] args)
	{	ArrayList a=new ArrayList();
	    a.add("APPLE");
	    a.add("MANGO");
	    a.add("GUAVA");
	    Scanner s=new Scanner(System.in);
	    
	    System.out.println(a);
		System.out.println("enter a FRUIT name ");
		String s1=s.next().trim().toLowerCase();
		
		if(a.contains(s1))
		{
			a.remove(s1);
		}
		System.out.println(a);
		if(!a.contains(s1))
		{
			a.add(s1);
		}
		System.out.println(a);
		
	}


}
