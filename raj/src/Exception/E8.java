package Exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class E8 {

	public static void main(String[] args) {
		System.out.println("Main Begins");
		
		try
		{
			new FileOutputStream("C\\Migration.text");
			System.out.println("your file is created");
		}
		catch(FileNotFoundException f) {
			
		}

	}

}
