package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenTheLinkinNewTabusingkeyboardaction 
{

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
   WebElement reglink=driver.findElement(By.linkText("Register"));
		Actions act= new Actions(driver);
		act.keyDown(Keys.CONTROL).click(reglink).keyUp(Keys.CONTROL).perform();

	}

}
