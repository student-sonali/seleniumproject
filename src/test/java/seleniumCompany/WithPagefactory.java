package seleniumCompany;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WithPagefactory 
{
	WebDriver driver;
	
	WithPagefactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(name="username")
	WebElement uname;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(xpath= "button[@type='submit']")
	WebElement click;
	
	
	void setumname(String u) 
	{
		uname.sendKeys(u);
	}
	
	void setpass(String p) 
	{
		pass.sendKeys(p);
		
	}
	
	void clickbtn() 
	{
		click.click();
	}
}
