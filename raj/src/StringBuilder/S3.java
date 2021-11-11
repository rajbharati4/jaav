package StringBuilder;

import java.util.Scanner;

//Ask the user whether he is a boy , girl, married man or married woman?////
//Use the string class to implement this//

//if the user is boy or girl, prefix the name with Master
//if married man, prefix with Mr.
//if married women, prefix with Mrs.

public class S3 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=s.nextLine();
		
		System.out.println("Select one of the following:");
		System.out.println("1.Boy");
		System.out.println("2.Girl");
		System.out.println("3.Married Man");
		System.out.println("4.Married Woman");
		
		int opt=s.nextInt();
		
		switch(opt)
		{
		case 1:
		case 2: name="Master "+name; break;
		case 3: name="Mr."+name; break;
		case 4: name="Mrs."+name; break;
		default:
			System.out.println("Enter a correct choice"); break;
		}
		
		System.out.println("The modified name is : "+ name);
		
		
			
		}
		
		
		
		
	}


