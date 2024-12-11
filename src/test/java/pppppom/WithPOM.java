package pppppom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WithPOM
{
	WebDriver driver;
	
	WithPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="username")
	WebElement u_name;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement click;
	
	public void user_name(String u)
	{
		u_name.sendKeys(u);
	}
	
	public void password(String p) 
	{
		pass.sendKeys(p);
		
	}
	
	public void btn() 
	{
		click.click();
		
	}
	

}
