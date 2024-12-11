package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageLink {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=common/home");
		driver.findElement(By.xpath("//img[@title='OpenCart - Demo']")).click();
		
		if(driver.getTitle().equals("OpenCart-Open Source Shopping cart Solution")) 
		{
			System.out.println("Test Pass");
		}
		else 
		{
			System.out.println("Test Failed");
		}
	

	}

}
