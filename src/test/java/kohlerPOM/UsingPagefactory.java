package kohlerPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsingPagefactory 
{
	WebDriver driver;
	UsingPagefactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement txt_username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_pass;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement click_btn;
	
	
	public void setusername(String user) 
	{
		txt_username.sendKeys(user);
	}
	
	public void setpassword(String pass) 
	{
		txt_pass.sendKeys(pass);
	}
	
	public void click() 
	{
		click_btn.click();
	}

}
