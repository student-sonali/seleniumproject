package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenExample {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		//Read file from excel
		  FileInputStream file= new FileInputStream(System.getProperty("user.dir")+"\\data\\Data1.xlsx");
		  
		  //cature workbook
		  XSSFWorkbook workbook=new XSSFWorkbook(file);

		  //extract specific sheet on workbook
	      XSSFSheet sheet= workbook.getSheet("Sheet1");
	      
	      //extract rows
	      int totalrow= sheet.getLastRowNum();
	      
	      //extract cells
	      int totalcell= sheet.getRow(1).getLastCellNum();
	      
	      System.out.println(totalrow);
	      System.out.println(totalcell);
	      
	      for(int r=1;r<=totalrow;r++) 
	      { 
	    	  WebDriver driver=new ChromeDriver();
	    	  driver.get("https://www.saucedemo.com/");
	    	  driver.manage().window().maximize();
	    	  
	    	  driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(sheet.getRow(r).getCell(0).toString());
	    	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys(sheet.getRow(r).getCell(1).toString());
	    	  driver.findElement(By.id("login-button")).click();
	    	  Thread.sleep(5000);
	          /*  XSSFRow	currentrow= sheet.getRow(r);
	    	  for(int c=0;c<totalcell;c++) 
	    	  {
	    	     XSSFCell currentcell= currentrow.getCell(c);
	    	     System.out.print(currentcell.toString()+"\t");
	    	  }
	    	  System.out.println();*/
	      }
	     workbook.close();
	     file.close();
		

	}

}
