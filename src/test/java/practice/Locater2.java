package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locater2 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("search")).sendKeys("mobile");
		
	boolean status=	driver.findElement(By.id("logo")).isDisplayed();
	System.out.println(status);
	}

}
