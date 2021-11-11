package Exception;

public class E7 {
	public static void main(String[] args) {
		
		System.out.println("Main Begins");
		
		try
		{
			demo();
		}
		catch(ArithmeticException a)
		{
			System.out.println("You can't divide a no by 0");
			
		}
		
		System.out.println("Main Ends");
	}
	public static void demo()
	{
		System.out.println("Demo begins");
		
		int a=10/0;
		
		System.out.println("Demo ends");
	}

}
