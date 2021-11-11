package File_Handling;

public class FinallyException {

	public static void main(String[] args) {
		
		int a=10/0;
		try
		{
			int b=10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("we cannot divide a no by 0");
		}
		finally
		{
			System.out.println("have a happy time");
		}

	}

}
