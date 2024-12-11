package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless {

	public static void main(String[] args) 
	{
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--headless=new");
		WebDriver driver= new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	WebElement dd=	 driver.findElement(By.name("username"));
	boolean xx=dd.isDisplayed();
	System.out.println(xx);

	}

}
