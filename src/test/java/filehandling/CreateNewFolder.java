package filehandling;

import java.io.File;

public class CreateNewFolder {

	public static void main(String[] args)
	{
		//String path="C:\\Hello";
		File ff= new File("C:\\Hello");
		if(!ff.exists()) 
		{
			if(ff.mkdir())
			{
				System.out.println("folder created");
			}
			else 
			{
				System.out.println("folder not created");
			}
		}
		else 
		{
			System.out.println("folder already exists");
			
		}
	

	}

}
