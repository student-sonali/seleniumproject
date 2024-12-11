package ppppselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		Actions ac= new Actions(driver);
		/*WebElement dd=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
        ac.doubleClick(dd).perform();*/
		
	/*WebElement ww=driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement dd=driver.findElement(By.xpath("//div[@id='droppable']"));
	ac.dragAndDrop(ww, dd).perform();*/
		
	WebElement ww=	driver.findElement(By.xpath("//button[normalize-space()='Point Me']"));
	ac.moveToElement(ww).perform();
	}

}
