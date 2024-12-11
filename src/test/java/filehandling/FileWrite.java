package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) throws IOException
	{
		FileWriter fw=new FileWriter("C:\\Hello\\sonali.txt") ;
		
			fw.write("my name is sonali");
			fw.close();
		
		

	}

}
