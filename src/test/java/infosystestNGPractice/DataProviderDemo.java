package infosystestNGPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//import org.testng.annotations.*;
import org.testng.annotations.DataProvider;

public class DataProviderDemo 
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
    @Test(dataProvider="dp")
   public void login(String email,String pass) 
    {
    driver.findElement(By.name("username")).clear();
   
    	driver.findElement(By.name("password")).clear();
    	driver.findElement(By.name("username")).sendKeys("email");
    	   
    	driver.findElement(By.name("password")).sendKeys("pass");
    	driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
    	
    	
    }
    
    @AfterClass
     void logout() 
     {
    	 driver.quit();
     }
    @DataProvider(name="dp")

    Object[][] logindata() 
    {
    	Object d[][]= {
    			{"Admin","admin123"},
    			{"Admin","admin123"},
    			
    	};
    	return d;
   
    }
	

}
