package comparable;

public class Employee 
{
	int eid;
	String name;
	double salary;
	
	Employee()
	{}
	
	Employee(String name,int eid,double salary)
	{
		this.name=name;
		this.eid=eid;
		this.salary=salary;
	}
	public int compareTo(Object o)
	{
		Employee e=(Employee)o;
		if(this.salary>e.salary)
			return 1;
		else if(this.salary==e.salary)
			return 0;
		else return -1;
	}
	public String toString() 
	{
		return ""+eid;
	}
	public static void main(String[] args) {
		
		Employee e1=new Employee();
		System.out.println(e1.toString());
	}
}
