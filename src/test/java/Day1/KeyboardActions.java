package Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("inputText1")).sendKeys("vivan");
		
		Actions ac= new Actions(driver);
		ac.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		ac.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		ac.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		ac.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		

	}

}
