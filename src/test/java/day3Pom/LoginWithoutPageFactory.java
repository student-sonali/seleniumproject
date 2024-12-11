package day3Pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginWithoutPageFactory
{
	WebDriver driver;
	@BeforeTest
	void setup() 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	@Test
	void login() 
	{
		WithoutPageFactory l= new WithoutPageFactory(driver);
		l.setusername("Admin");
		l.setpass("admin123");
		l.clickbtn();
		
	}

}
