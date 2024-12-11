package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WithPageFactory 
{
	WebDriver driver;
	
	WithPageFactory(WebDriver d)
	{
		driver=d;	
	}
	
	By username=By.id("user-name");
	By password=By.id("password");
	By login_button=By.id("login-button");
	
	
	public void enterusername(String uname) 
	{
		driver.findElement(username).sendKeys(uname);
		
	}
	public void enterpassword(String pass) 
	{
		driver.findElement(password).sendKeys(pass);
	}
	public void clickbutton() 
	{
		driver.findElement(login_button).click();
	}
}
