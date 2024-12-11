package seleniumpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePicker {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		//switching  frame
		driver.switchTo().frame(0);
		
		//Approch1 using sendkeys method
		//driver.findElement(By.id("datepicker")).sendKeys("04/05/2024"); //mm/yy//yyyy
		
		//Approch2 using Datepicker
		//expected data
		String year= "2027";
		String month= "April";
		String date="20";
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		//select month and year
		while(true) 
		{
		WebElement currentmon=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ui-datepicker-month']")));
		currentmon.getText();
			 //String currentmon=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); //return actual month
			 String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();//return actual year
			 if(currentmon.equals(month)&&currentyear.equals(year))
             {
				 break;
             }
			 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //next
			 //driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();//previous
		 }
		    
		 List<WebElement> alldates=  driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		 for(WebElement all:alldates) 
		 {
			if( all.getText().equals(date)) 
			{
				all.click();
				break;
			}
		 }
		

	}

}
