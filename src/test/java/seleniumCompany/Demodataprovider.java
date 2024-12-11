package seleniumCompany;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demodataprovider 
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
	@Test(dataProvider="dp")
	void login(String u, String p) 
	{
		driver.findElement(By.xpath("//input[@placeholder='username']")).sendKeys(u);
		driver.findElement(By.xpath("//input[@placeholder='password']")).sendKeys(p);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@DataProvider(name="dp")
	Object[][] DataSet()
	{
		Object d[][]= {{"Admin", "admin123"},
				{"Admin", "admin123"}};
		return d;
		}
		
	}


