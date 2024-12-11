package Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		Actions ac=new Actions(driver);
		
		//MoveToElement
	  /*  WebElement w=driver.findElement(By.xpath("//button[normalize-space()='Point Me']"));
	    ac.moveToElement(w).perform();
	    WebElement ww= driver.findElement(By.linkText("Mobiles"));
		ac.moveToElement(ww).perform();*/
		
		//DoubleClick
		/*WebElement w=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		ac.doubleClick(w).perform();*/
		
		//dragAndDrop
	     WebElement w=driver.findElement(By.id("draggable"));
	     WebElement w1= driver.findElement(By.xpath("//div[@id='droppable']"));
	     ac.dragAndDrop(w, w1).perform();

	}

}
