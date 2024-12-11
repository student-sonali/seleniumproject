package seleniuminfosyspractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
       WebElement ss=driver.findElement(By.id("draggable"));
       WebElement dd= driver.findElement(By.id("droppable"));
		Actions ac= new Actions(driver);
		ac.dragAndDrop(ss, dd).perform();
	}

}
