package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo2
{
	@Parameters({"keyword"})
	@Test
	public void launch(String searchdata) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
	WebElement el=	driver.findElement(By.id("APjFqb"));
	el.sendKeys(searchdata);
	}

}
