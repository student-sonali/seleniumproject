package seleniuminfosyspractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) 
	{
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});
		//options.addArguments("--incognito");
		WebDriver driver= new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
	WebElement dd=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	Actions ac=new Actions(driver);
	ac.contextClick(dd).perform();
		
		

	}

}
