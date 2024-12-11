package pppppom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginWithPOM 
{
	WebDriver driver;
	@BeforeMethod
	public void setup() 
	{
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	@Test
	public void login() 
	{
		WithPOM ll=new WithPOM(driver);
		ll.user_name("Admin");
		ll.password("admin123");
		ll.btn();
		
	}

}
