package Array;
import java.util.Scanner;

public class A2 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
	    String [] s1=new String[5];
	    System.out.println("Enter the 5 name");
	    
	    for(int i=0;i<s1.length;i++)
	    {
	    	s1[i]=s.nextLine();
	    	
	    }
	    for(int i=0;i<s1.length;i++)
	    {
	    	System.out.println(s1[i]);
	    }
	   
	}
	    
}
