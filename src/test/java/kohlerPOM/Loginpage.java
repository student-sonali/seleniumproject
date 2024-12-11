package kohlerPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage
{
	WebDriver driver;
	Loginpage(WebDriver driver)    //initiate the driver
	{
		this.driver=driver;
		
	}
	//locaters
	By txt_user_name=By.xpath("//input[@placeholder='Username']");
	By txt_pass= By.xpath("//input[@placeholder='Password']");
	By click_login=By.xpath("//button[normalize-space()='Login']");
	
	//Action methods
	public  void setusername(String user_name)
	{
		driver.findElement(txt_user_name).sendKeys(user_name);
	}	

	public void setpassword(String pass) 
	{
		driver.findElement(txt_pass).sendKeys(pass);
	}
	
	public void clickbtn() 
	{
		driver.findElement(click_login).click();
	}

	

}
