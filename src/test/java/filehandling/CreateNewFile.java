package filehandling;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {

	public static void main(String[] args) throws IOException 
	{

		File ff=new File("C:\\Hello\\sonali.txt");
		

			if(ff.createNewFile()) 
			{
				System.out.println("file created");
			}
			else 
			{
				System.out.println("file not created");
			}
			

	}

}
