package ppppselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExcuitorDemo {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
	   WebElement w=driver.findElement(By.id("name"));
		js.executeScript("arguments[0].setAttribute('value','vivan')", w);
		
		WebElement w1=driver.findElement(By.id("male"));
		js.executeScript("arguments[0].click()", w1);
		
		//js.executeScript("window.scrollBy(0,1000)", "");
		
		//js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		Thread.sleep(3000);
		
		//js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
		
	WebElement www=	driver.findElement(By.id("draggable"));
	js.executeScript("arguments[0].scrollIntoView()", www);
	
	
	js.executeScript("document.body.style.zoom='50%'");

	}

}
