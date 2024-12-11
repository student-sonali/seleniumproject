package infosystestNGPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(infosystestNGPractice.Listener.class)
public class DemoListener
{
	WebDriver driver;
	@Test
	public void setup()
	{
	     driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	public void logo() 
	{
	boolean status=	driver.findElement(By.name("username")).isDisplayed();
	Assert.assertEquals(status, true);
	}
    @Test(priority=2)
	public void appUrl() 
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login;/");
	}
	@Test(priority=3, dependsOnMethods= {"appUrl"})
	public void HomePageTitle() 
	{
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	@AfterClass
	public void teardown() 
	{
		driver.quit();
	}
	
}
