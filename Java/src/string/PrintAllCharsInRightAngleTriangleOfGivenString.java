package string;

public class PrintAllCharsInRightAngleTriangleOfGivenString {

public static void main(String[] args) {
		
		String s="Rajshekhar";
		String revStr="";
		
		for(int i=0;i<s.length();i++)
		{
			revStr=revStr+s.charAt(i);
			System.out.println(revStr);
		}
		
		
	}
}
