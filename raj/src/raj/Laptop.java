package raj;

public class Laptop 
{
	int ram;
	int rom;
	double ps;
	Laptop()
	{}
	Laptop(int ram,int rom)
	{
		this.ram=ram;
		this.rom=rom;
	}
	Laptop(int ram,int rom,double ps)
	{
		Laptop l=new Laptop(ram,rom);
		System.out.println(l.ram);
		System.out.println(l.rom);
		this.ps=ps;
	}
	public void display()
	{
		System.out.println(ps);
	}
	
				
	public static void main(String[] args) 
	{
		Laptop l=new Laptop(8,1,2.4);
		l.display();
	}

}
