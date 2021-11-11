package Collection;

import java.util.ArrayList;
import java.util.Scanner;import java.util.Scanner;

public class C4 
{
	public static void main(String[] args)
	{	
		ArrayList a=new ArrayList();
	    a.add("Martha");
	    a.add("Sansa");
	    a.add("Kendal");
	    
	    ArrayList a1=new ArrayList();
	    
	    a1.add("Kylie");
	    
	    System.out.println("a1.size(): " +a1.size());
	    
	    ArrayList a2=new ArrayList();
	    a2.add("Jennifer");
	    a2.add("Megan");
	    
	    System.out.println("a2.size(): " +a2.size());
	    
	    ArrayList a3=new ArrayList(5);
	    a3.addAll(0, a2);
	    System.out.println(a3);
	    
	}

}
