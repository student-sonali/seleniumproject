package filehandling;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args)
	{
		File ff=new File("C:\\Hello\\sonali.txt");
		if(ff.delete()) 
		{
			System.out.println("File Deleted:"+ ff.getName());
		}else 
		{
			System.out.println("some problem while deleting file");
		}
		

	}

}
