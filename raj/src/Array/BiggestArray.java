package Array;

public class BiggestArray 

{
	public static void main(String[] args)
	{
		int a[]= {23,12,14,56,22,28,13};
		int b=a[0];
		int s=a[1];
		for(int i=0;i<a.length;i++)
		{
			if(b<a[i])
			{
				s=b;
				b =a[i];
			}
			else if(s<a[i])
			{
				s=a[i];
			}
			System.out.println(b);
			System.out.println(s);
				
		}
	}

}
