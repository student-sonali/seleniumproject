package infosys;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo 
{
	WebDriver driver;
	@BeforeClass
	void setup() 
	{
		 driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
	}
	@Test
	void login() 
	{
		System.out.println("Testcase is passed");
	}
	
	
	
	 
	@AfterClass
	void teardown() 
	{
		driver.quit();
	}
	

}
