package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver1 
{
	public static void main (String[]args)
	{
		ArrayList<Employee> s=new ArrayList<Employee>();
		
		s.add(new Employee("Sheela",2,2000));
		s.add(new Employee("Maala",1,3000));
		s.add(new Employee("Leela",3,1575));
		
		System.out.println(s);
		//Collections.sort(s);
		//System.out.println(s);
		
		Collections.reverse(s);
		System.out.println(s);
	}
		

}
