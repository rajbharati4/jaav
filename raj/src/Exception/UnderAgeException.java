package Exception;

import java.util.Scanner;

public class UnderAgeException extends Exception {
	
	UnderAgeException()
	{
		//super();
	}
	
	UnderAgeException(String msg)
	{
		super(msg);
	}
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter your age");
		
		int age=s.nextInt();
		
		if(age<18)
		{
			try {
				throw new UnderAgeException("you are underage");
			}
			catch(UnderAgeException u)
			{
			  u.printStackTrace();
			  u.getMessage();
			  System.out.println("wait till you turn 18");
			}
		}
		else
			System.out.println("you are eligible to vote");
	}
}
