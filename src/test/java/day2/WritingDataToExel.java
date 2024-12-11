package day2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataToExel {

	public static void main(String[] args) throws IOException 
	{
		FileOutputStream file= new FileOutputStream("C:\\Automation\\selenium Webdriver\\Webdriverjavaproject\\seleniumproject\\data\\ss.xlsx");
		XSSFWorkbook book= new XSSFWorkbook();
	    XSSFSheet sheet=book.createSheet("sheet1");
	     XSSFRow row1=sheet.createRow(0);
	     row1.createCell(0).setCellValue("sonali");
	     row1.createCell(1).setCellValue("vivan");
	     row1.createCell(2).setCellValue("vivan");
	
         book.write(file);
         book.close();
         file.close();
         
	}

}
