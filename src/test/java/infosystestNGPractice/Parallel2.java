package infosystestNGPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Parallel2 
{
	WebDriver driver;
	
    @BeforeClass
	void setup() 
	{
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
    @Test
    void gettitle() 
    {
    	boolean ss=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
    	//Assert.assertEquals(driver.getTitle(), "");
    	System.out.println(ss);
    	
    }
    @AfterClass
     void logout() 
     {
    	// driver.quit();
     }
	

}
