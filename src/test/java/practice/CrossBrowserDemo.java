package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CrossBrowserDemo
{
	WebDriver driver;
	@BeforeMethod
	public void launch(String browser) 
	{
		switch(browser.toLowerCase())
		{
		case "chrome":
		WebDriver driver1=new ChromeDriver();
		break;
		
		case "Edge":
			
			WebDriver driver=new EdgeDriver();
	}
		}
	
	@Test
	public void verifytitle() 
	{
		driver.get("https://www.saucedemo.com/");
	WebElement el=	driver.findElement(By.className("login_logo"));
    	Assert.assertTrue(el.isDisplayed());
		
	}
	
	public void clos() 
	{ driver.close();
		
	}

}
