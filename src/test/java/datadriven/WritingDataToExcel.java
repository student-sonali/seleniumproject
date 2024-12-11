package datadriven;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataToExcel {

	public static void main(String[] args) throws IOException 
	{
		  FileOutputStream file= new FileOutputStream("C:\\Automation\\selenium Webdriver\\Webdriverjavaproject\\seleniumproject\\data\\Data3.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		
	    XSSFSheet sheet=workbook.createSheet("sheet1");
	   XSSFRow row1= sheet.createRow(0);
	   row1.createCell(0).setCellValue("Welcome");
	   row1.createCell(1).setCellValue(19);
	   row1.createCell(1).setCellValue("Java");
	   
	   XSSFRow row2= sheet.createRow(1);
	   row2.createCell(0).setCellValue("python");
	   row2.createCell(1).setCellValue(3);
	   row2.createCell(1).setCellValue("selinium");
	   
	   
	   XSSFRow row3= sheet.createRow(2);
	   row3.createCell(0).setCellValue("c#");
	   row3.createCell(1).setCellValue(5);
	   row3.createCell(1).setCellValue("automation");
	   
	   
		
	   workbook.write(file);
	   workbook.close();
	   file.close();
	   System.out.println("file created");
	}

}
