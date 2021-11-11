package StringBuilder;

public class S1 
{
	public static void main(String[] args) 
	{
		StringBuilder b= new StringBuilder();
        System.out.println(b);
        
		String s="Raj";
		StringBuilder b1= new StringBuilder(s);
		StringBuilder b2= new StringBuilder(s);

		System.out.println(b1);
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b1.equals(s));
		System.out.println(b1.equals(b2));
	}
}


