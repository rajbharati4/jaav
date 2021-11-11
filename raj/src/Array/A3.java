package Array;
import java.util.Scanner;

public class A3 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
	    int [] s1=new int[5];
	    System.out.println("Enter the 5 no");
	    
	    for(int i=0;i<s1.length;i++)
	    {
	    	s1[i]=s.nextInt();	
	    }
	    for(int i=0;i<s1.length;i++)
	    {
	    	if(i%2==0)
	    	System.out.print(s1[i]+" ");
	    }
	   
	}

}
