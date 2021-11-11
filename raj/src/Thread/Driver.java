package Thread;

public class Driver {
public static void main(String[] args) {
		
		System.out.println("Name:"+Thread.currentThread().getName());
		
		T1 t= new T1();
		t.start();
		
	}
}


