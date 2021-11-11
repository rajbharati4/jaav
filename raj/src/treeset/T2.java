package treeset;

import java.util.Scanner;
import java.util.TreeSet;

public class T2 {

	public static void main(String[] args) {
		
		TreeSet t= new TreeSet();
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter a string");
		
		String s1=s.nextLine();
		
		for(int i=0; i<s1.length(); i++) {
			
			t.add(s1.charAt(i));
		}
		
		System.out.println(t);

	}

}
