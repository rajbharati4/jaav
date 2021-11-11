package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Product {

	public static void main(String[] args) { 
			
		List lst = new ArrayList();
		lst.add("Babu");
		lst.add("Suresh");
		lst.add("Arun");
		lst.add("Zain");
		System.out.println(lst); 
		
	
	Iterator<String> itr=lst.iterator();  
	while(itr.hasNext()) 
	{ 
		String name=itr.next(); 
		System.out.println(name);
	if(name=="Suresh") 
		itr.remove();  
	}
	System.out.println(lst);
	}
}
	


