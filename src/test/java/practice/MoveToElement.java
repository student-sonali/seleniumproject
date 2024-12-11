package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
WebElement element=	driver.findElement(By.id("nav-link-accountList"));
     Actions ac=new Actions(driver);
     ac.moveToElement(element).perform();
	}

}
