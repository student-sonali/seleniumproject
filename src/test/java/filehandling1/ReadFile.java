package filehandling1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) throws FileNotFoundException 
	{
		File ff= new File("C:\\vivan\\vivi.txt");
		Scanner sc= new Scanner(ff);
		while(sc.hasNextLine()) 
		{
			System.out.println(sc.nextLine());
		}
         sc.close();
	}

}
