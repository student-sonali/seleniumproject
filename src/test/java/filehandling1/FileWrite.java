package filehandling1;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) throws IOException
	{
		FileWriter w= new FileWriter("C:\\vivan\\vivi.txt");
		w.write("My name is vivan");
		w.close();

	}

}
