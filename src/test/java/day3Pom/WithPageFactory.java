package day3Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WithPageFactory 
{
    WebDriver driver;
    WithPageFactory(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements( driver, this);
    }
    
    @FindBy(name="username")
    WebElement unname;
    
    @FindBy(name="password")
    WebElement pass;
    
    @FindBy(xpath="//button[@type='submit']")
    WebElement click;
    
    
    void setusername(String u) 
    {
    	unname.sendKeys(u);
    	
    }
    
    void setpassword(String p) 
    {
    	pass.sendKeys(p);
    	
    }
    void clickbtn() 
    {
    	click.click();
    }

}
