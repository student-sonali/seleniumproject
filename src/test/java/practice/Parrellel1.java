package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Parrellel1 
{
	WebDriver driver;
	
	@Test
	public void Launch() 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
	
	@Test
	public void LagoVerify() 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
	WebElement el=	driver.findElement(By.xpath("//div[@class='login_logo']"));
	Assert.assertTrue(el.isDisplayed());
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.quit();
	}

}
