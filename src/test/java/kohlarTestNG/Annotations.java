package kohlarTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotations 
{
	WebDriver driver;
	@BeforeClass
	public void setup() 
	{
	    driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	public void search() 
	{
		driver.findElement(By.name("q")).sendKeys("mobile");
	}
	@Test(priority=2,dependsOnMethods= {"search"})
	public void verify() 
	{
		boolean ss=driver.findElement(By.linkText("Login")).isDisplayed();
		Assert.assertEquals(ss, true);
	}
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}

}
