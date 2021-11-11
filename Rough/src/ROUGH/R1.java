package ROUGH;

 class R1 
{
	int a;
	public R1()
	{}
	
	private R1(int a)
	{
	this.a=a;
	}
}
class R2 extends R1
{
	R2()
	{
		super();
	}

	public static void main(String[] args)
	{
		
		R1 r=new R1();
	}
	
}
