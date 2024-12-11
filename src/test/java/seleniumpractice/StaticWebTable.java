package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//count rows in table
	    int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
	    System.out.println(rows);
	    
	    //count columns in table
	    int columns=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
	    System.out.println(columns);
	    
	    //read specific row and coloums(5th row and 1 colm)
	    String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();	    
		//System.out.println(bookname);
		
		WebElement subject=driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[3]"));
		String sub=subject.getText();
		//System.out.println(sub);
		
		//read all the data from table
		for(int r=2;r<=rows;r++) 
		{
			for(int c=1;c<=columns;c++) 
			{
			String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
			System.out.print(value+"\t");
			}
			System.out.println();
		}
		
		//print book names whose author name mukesh
		

	}

}
