package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithPageFactory1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		WithPageFactory factory=new WithPageFactory(driver);
		driver.get("https://www.saucedemo.com/");
		
		factory.enterusername("standard_user");
		factory.enterpassword("secret_sauce");
		factory.clickbutton();
		
		driver.close();

	}

}
