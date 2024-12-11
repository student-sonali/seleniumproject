package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFile {

	public static void main(String[] args) throws FileNotFoundException
	{
		File ff=new File("C:\\Hello\\sonali.txt");
		Scanner sc= new Scanner(ff);
		while(sc.hasNextLine()) 
		{
		System.out.println(sc.nextLine());	
		}
     sc.close();
	}

}
