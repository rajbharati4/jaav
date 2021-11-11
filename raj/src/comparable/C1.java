package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class C1 
{
	public static void main (String[]args)
	{
		ArrayList a=new ArrayList ();
		a.add(20);
		a.add(10);
		a.add(40);
		a.add(30);
	
		System.out.println("before sorting"+" "+a);
		Collections.sort(a);
		System.out.println("after sorting"+" "+a);
		
		Collections.reverse(a);
		System.out.println("after reversing"+" "+a);
		
		Collections.shuffle(a);
		System.out.println("after shufling"+" "+a);
	}

	

}
