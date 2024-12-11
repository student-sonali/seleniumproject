package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters3 {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		// driver.findElement(By.partialLinkText("Sauce Labs Bolt ")).click();
		
List <WebElement>	elementlist=	driver.findElements(By.partialLinkText("Sauce"));
System.out.println("Element size"+ elementlist.size());
		//driver.quit();
		

	}

}
