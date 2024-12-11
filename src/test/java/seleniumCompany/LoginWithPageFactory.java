package seleniumCompany;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginWithPageFactory
{
	WebDriver driver;
	@BeforeMethod
	void setup() 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
    @Test
	void login() 
	{
		WithoutPageFactory wf =new WithoutPageFactory(driver) ;
		{
			wf.setusername("Admin");
			wf.setpass("admin123");
			wf.clickbtn();
		}
	}
}
