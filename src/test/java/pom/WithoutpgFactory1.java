package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutpgFactory1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		WithoutPgFactory fact=new WithoutPgFactory(driver);
		driver.get("https://www.saucedemo.com/");
		fact.searchlogin("standard_user");
		fact.searchpass("secret_sauce");
		fact.clickbtn();
		
		driver.quit();
		

	}

}
