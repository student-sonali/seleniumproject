package filehandling1;

import java.io.File;

public class CreateNewFolder {

	public static void main(String[] args) 
	{
		File ff=new File("C:\\vivan");
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
			System.out.println("floder already exists");
		}

	}

}
