package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgDemo
{
	@Test
	public void verifyPageTitle() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	String actualTitle=	driver.getTitle();
	String expectedTitle= "Google";
	Assert.assertEquals(actualTitle, expectedTitle);
	driver.quit();
	
	}

}
