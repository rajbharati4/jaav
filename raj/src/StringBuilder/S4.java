package StringBuilder;

public class S4 
{
	public static void main(String[] args) 
	{
		StringBuilder b= new StringBuilder(" Nitin");
		StringBuilder b1= new StringBuilder();
		
		for(int i=b.length()-1;i>=0;i--)
		{
			b1.append(b.charAt(i));
		}
		System.out.println(b1);
		b1=b.reverse();
		System.out.println(b1);
	}

}
