package day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExel {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Automation\\selenium Webdriver\\Webdriverjavaproject\\seleniumproject\\data\\Data.xlsx");
		XSSFWorkbook book= new XSSFWorkbook(file);
	    XSSFSheet sheet=book.getSheet("sheet1");
	   int totalrow= sheet.getLastRowNum();
	   int totalcell= sheet.getRow(1).getLastCellNum();
	   
	   for(int r=0;r<totalrow;r++) 
	   {
		  XSSFRow currentrow = sheet.getRow(r);
		   for(int c=0; c<totalcell;c++) 
		   {
			 XSSFCell currentcell= currentrow.getCell(c);
			 System.out.print(currentcell.toString()+"\t");
			   
		   }
		   System.out.println();
	   }
	   book.close();
	   file.close();
	  
	

	}

}
