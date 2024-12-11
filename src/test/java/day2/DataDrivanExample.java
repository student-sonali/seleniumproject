package day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivanExample {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file= new FileInputStream("C:\\Automation\\selenium Webdriver\\Webdriverjavaproject\\seleniumproject\\data\\Data1.xlsx");
        XSSFWorkbook book= new XSSFWorkbook(file);
        XSSFSheet sheet= book.getSheet("sheet1");
       int totalrow= sheet.getLastRowNum();
       int totalcell=sheet.getRow(1).getLastCellNum();
       
       
       for(int r=0;r<totalrow;r++) 
       {
    	   WebDriver driver=new ChromeDriver();
	    	  driver.get("https://www.saucedemo.com/");
	    	  driver.manage().window().maximize();
	    	  
	    	  driver.findElement(By.id("user-name")).sendKeys(sheet.getRow(r).getCell(0).toString());
	    	  driver.findElement(By.id("password")).sendKeys(sheet.getRow(r).getCell(1).toString());
	    	  driver.findElement(By.id("login-button")).click();
       }
       book.close();
       file.close();
	}

}
