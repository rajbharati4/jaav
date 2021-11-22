package string;

public class ReverseString{
	
public static void main(String[] args) {
		
		String s="Raj";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
	}	
}
class ReverseStr {
	
	public static void main(String[] args) {
		
		String s="Raj";
		String revStr="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			revStr=revStr+s.charAt(i);
		}
		
		System.out.println(revStr);
	}
}

class ReverseStringWithoutLengthMethod
{
	public static void main(String[] args) {
		
		String s="Raj";
		String revStr="";
		int count=s.compareTo(revStr);
		
		for(int i=count-1;i>=0;i--)
		{
			revStr=revStr+s.charAt(i);
		}
		
		System.out.println(revStr);
	}
}

