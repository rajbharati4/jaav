package File_Handling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class F1 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter some path");
		
		String path=s.next();
		System.out.println("enter the flie name0");
		
		String filename=s.next();
		System.out.println("enter the data");
		s.nextLine();
		
		String data=s.nextLine();
		
		FileOutputStream fout=null;
		
		try
		{
			fout=new FileOutputStream(path+filename);
			System.out.println("file is created");
			
			for(int i=0;i<data.length(); i++)
			{
				fout.write(data.charAt(i));
			}
		}
		catch(FileNotFoundException f)
		{
			System.out.println("path is incorrect");
			System.out.println("no permission allowed");
			System.out.println("insufficient memory");
		}
		
		catch(IOException i)
		{
			System.out.println("file created");
			System.out.println("data can be written");
		}
		finally
		{
			if(fout!=null)
			{
				try {
					fout.close();
					System.out.println("file is closed");
					
				}
				catch(IOException i)
				{
					System.out.println("some exception happened");
					System.out.println("close the app and restart");
				}
			}
			
			System.out.println("thank you");
		}
		
		

	}

}
