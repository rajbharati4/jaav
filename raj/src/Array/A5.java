package Array;

public class A5 
{
		public static void main(String[] args) 
		{
			int a []= new int[5];
			int fact=1;
			for(int i=1;i<=5;i++)
			{
				fact=fact*i;
				a[i-1]=fact;
			}
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+" ");
			}
			
		}			

}



