package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E6 
{

	public static void main(String[] args) 
	{
		
		Scanner s=new Scanner (System.in);
		System.out.println("enter numbers");
		
		try
		{
			int a=s.nextInt();
			int b=s.nextInt();
			int c=a/b;
			System.out.println(c);
		}
		
		catch(InputMismatchException i)
		{
			System.out.println("enter the integer numbers");
		}
		catch(ArithmeticException i)
		{
			System.out.println("You can't divide a no by 0");
		}
		
		
    }

}
