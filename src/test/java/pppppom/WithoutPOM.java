package pppppom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WithoutPOM
{
	WebDriver driver;
	WithoutPOM(WebDriver driver)
	{
		this.driver=driver;
	}

	
     By u_name=By.name("username");
     By pass=  By.name("password");
     By click= By.xpath("//button[normalize-space()='Login']");
     
     public void user_name(String u) 
     {
    	 driver.findElement(u_name).sendKeys(u);
     }
     
     public void password(String p) 
     {
    	 driver.findElement(pass).sendKeys(p);
     }
     
     public void btn() 
     {
    	 driver.findElement(click).click();
     }
}


