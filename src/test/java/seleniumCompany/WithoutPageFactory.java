package seleniumCompany;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WithoutPageFactory 
{

	
		WebDriver driver;
		
		WithoutPageFactory(WebDriver driver)
		{
			this.driver=driver;
		}
		
		By uname=By.name("username");
	    By pass=By.name("password");
	    By sub= By.xpath("//button[@type='submit']");
	    
	    
	     void setusername(String u) 
	    {
	    	 driver.findElement(uname).sendKeys(u);
	    	
	    }
	     public void setpass(String p) 
	     {
	    	 driver.findElement(pass).sendKeys(p);
	     }
	     
	     public void clickbtn() 
	     {
	    	 driver.findElement(sub).click();
	     }
		

	}


