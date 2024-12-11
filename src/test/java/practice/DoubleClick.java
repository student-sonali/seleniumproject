package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		WebElement element=driver.findElement(By.id("doubleClickBtn"));
		Actions ac= new Actions(driver);
		ac.doubleClick(element).perform();
		

	}

}
