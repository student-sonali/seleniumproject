package day4TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertDemo
{
	WebDriver driver;
	@BeforeMethod
	public void setup() 
	{
		driver=  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}

	@Test
    public void logo() 
    
    {
		Assert.assertEquals(driver.getTitle(), "Flipkart");
    	
    }
}
