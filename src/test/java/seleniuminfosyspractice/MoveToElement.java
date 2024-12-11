package seleniuminfosyspractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		
		Actions ac = new Actions(driver);
	WebElement ss=	driver.findElement(By.linkText("Solutions"));
//WebElement dd=	driver.findElement(By.xpath("//body[1]/nav[1]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]"));
		ac.moveToElement(ss).moveToElement(dd).perform();
		

	}

}
