package filehandling;

import java.io.File;

public class RenameFileName {

	public static void main(String[] args)
	{
		File ff1=new File("C:\\Hello\\sonali.txt");
		File ff2=new File("C:\\Hello\\vivan.txt");
       if( ff1.renameTo(ff2)) 
       {
    	   System.out.println("rename file");
       }
   
	}

}
