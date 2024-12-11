package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

public class WithoutPgFactory 
{
	WebDriver driver;
	WithoutPgFactory(WebDriver d)
	{
		driver= d;
		PageFactory.initElements(driver,this);
	}
	
     @FindBy(id="user-name")
	WebElement username;
     
     @FindBy(id="password")
     WebElement password;
     
     @FindBy(id="login-button")
     WebElement loginbutton;
     
     
     public void searchlogin(String uname) 
     {
    	 username.sendKeys(uname);
     }
     public void searchpass(String pass) 
     {
    	 password.sendKeys(pass);
     }
     public void clickbtn() 
     {
    	 loginbutton.click();
     }

}
