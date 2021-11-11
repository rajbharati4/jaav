package StringBuilder;

public class S2 
{
	public static void main(String[] args) 
	{
		StringBuilder b= new StringBuilder(" said Dinga");
		StringBuilder b1= new StringBuilder("Rahul");
		
		b1.append(" Batted well in 1st inings,");
        b1.append(b);
		System.out.println(b1);
	}
		

}
