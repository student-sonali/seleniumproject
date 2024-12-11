package day3Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;

public class WithoutPageFactory 
{
	WebDriver driver;
	
	WithoutPageFactory(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	 By u_name=By.name("username");
	 By pass= By.name("password");
     By click= By.xpath("//button[@type='submit']");
     
     
     void setusername(String u) 
     {
    	 driver.findElement(u_name).sendKeys(u);
     }

     void setpass(String p) 
     {
    	 driver.findElement(pass).sendKeys(p);
     }
     
     void clickbtn() 
     {
    	 driver.findElement(click).click();
     }
}
