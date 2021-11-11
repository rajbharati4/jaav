package Wrapper;

public class W5 {

	public static void main(String[] args) {
		
		Integer i=10;
		int i1=i.intValue();       //Explicit-unboxing:Process of converting non-primitive datatype into primitive datatype explicitely.
		                           // intValue() is the non static method present in the Integer class
		                           // valueOf() is a static method present in Integer class.
		
		System.out.println(i);
		System.out.println(i1);

	}

}
