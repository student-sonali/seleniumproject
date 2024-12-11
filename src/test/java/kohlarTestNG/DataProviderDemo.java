package kohlarTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo
{
	WebDriver driver;
	@Test
	void setup() 
	{
	    driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	@Test(dataProvider= "dp")
	void login(String email,String pass) 
	{
		driver.findElement(By.name("username")).sendKeys("email");
		driver.findElement(By.xpath("password")).sendKeys("pass");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@DataProvider(name="dp")
	Object[] [] logindata()
	{
		Object a[][]= {{"Admin","admin123"}
				
		};
		return a;
	}
	

}
