package Collection;
import java.util.ArrayList;
import java.util.Scanner;


public class C2 
{
	public static void main(String[] args)
	{	ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(39);
		a.add(56);
		a.add(99);
		System.out.println(a);
		Scanner s=new Scanner(System.in);
		System.out.println("enter an element to search");
		
		int key=s.nextInt();
		System.out.println(a.contains(key));
		
		int a1=a.indexOf(key);
		System.out.println("the index of "+ key +" is: "+ a1);
		
	}

}
