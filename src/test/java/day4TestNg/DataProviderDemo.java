package day4TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo 
{
	WebDriver driver;
	@BeforeMethod
	void setup() 
	{
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	@Test(dataProvider="dp")
	void login(String user ,String pass) 
	{
		driver.findElement(By.xpath("//input[@placeholder='username']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@placeholder='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}
	
	@DataProvider(name="dp")
	Object [][] logindata()
	{
		Object d[][]={ {"Admin", "admin123"},
				{"Admin", "admin123"}};
		return d;
	}

}
