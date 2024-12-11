package kohlerPOM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTestPageFactory 
{
	WebDriver driver;
	@BeforeClass
	void setup() 
	{
		 driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	@Test
	void testlogin() 
	{
		UsingPagefactory pg=new UsingPagefactory(driver);
		pg.setusername("Admin");
		pg.setpassword("admin123");
		pg.click();
	}
	@AfterClass
	void teardown() 
	{
		driver.quit();
	}


}
