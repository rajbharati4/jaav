package Exception;

import java.util.InputMismatchException;

public class E5 {

	public static void main(String[] args) 
	{
		
		try
		{
			int a=1/0;
		}
		catch(InputMismatchException i)
		{
			System.out.println("enter correct i/p");
		}
		
	}

}
