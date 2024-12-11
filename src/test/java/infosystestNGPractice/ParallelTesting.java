package infosystestNGPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class ParallelTesting {

	WebDriver driver;
	
	    @BeforeClass
	    @Parameters({"browser"})
		void setup(String b) 
		{
	    	switch(b) 
	    	{
	    	case "chrome": driver= new ChromeDriver();break;
	    	case "edge": driver=new EdgeDriver();break;
	    	case "firefox": driver=new FirefoxDriver();break;
	    	default: System.out.println("invalid browser");
	    	}
	    	
	    	
	    	
	    	
	    	
			//driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
		}
	    @Test
	    void gettitle() 
	    {
	    	//driver.findElement(By.xpath("//img[@alt='company-branding']"))
	    	Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	    	
	    }
	    @AfterClass
	     void logout() 
	     {
	    	 //driver.quit();
	     }
		

	

}
