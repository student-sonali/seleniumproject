package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args)
	{ 
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
	WebElement source=	driver.findElement(By.id("block-2"));
	 WebElement dest=driver.findElement(By.id("block-1"));
	 Actions ac =new Actions(driver);
	 ac.dragAndDrop(source, dest).perform();

	}

}
