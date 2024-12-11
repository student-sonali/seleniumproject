package practice;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Verification 
{
	@Test
	public void assertdemo() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println("Verifying title");
		Assert.assertEquals(driver.getTitle(), "Automation Testing Practice1");
		
		System.out.println("Verifying wikipedia icon");
	WebElement el=	driver.findElement(By.className("wikipedia-icon"));
	Assert.assertTrue(el.isDisplayed());
	
	System.out.println("Verifying search button");
	 WebElement el1=driver.findElement(By.className("wikipedia-search-button"));
	Assert.assertTrue(el1.isDisplayed());
	
	
		
}
}