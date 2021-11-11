package MethodOverloading;

public class Student 
{
	static void student(String name)
	{
		System.out.println("the name of student is " +name);
	}
	static void student(int rollno)
	{
		System.out.println("the rollno of student is ");
	}
	public static void main(String[] args)
	{
		student("raj");
		student(2);
	}

}
