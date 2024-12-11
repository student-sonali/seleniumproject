package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//get - to open url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		//getTitle - returns title of the page
		System.out.println(driver.getTitle());
		
		//getCurentUrl- reurns url of the page
		System.out.println(driver.getCurrentUrl());
		
		//getPageSource- returns source code of the page
		System.out.println(driver.getPageSource());
		
		//getWindowHandle - returns id of the single browser window
	    System.out.println(driver.getWindowHandle());
	    
	    //getWindowHandles - returns id's of the multiple browser window
	    System.out.println(driver.getWindowHandles());
	    
	    Thread.sleep(5000);
	    
	    driver.navigate().back();	
	    Thread.sleep(5000);
	    driver.navigate().forward();
	    driver.navigate().refresh();
		//driver.close();
	    //driver.quit();
	
	}

}
