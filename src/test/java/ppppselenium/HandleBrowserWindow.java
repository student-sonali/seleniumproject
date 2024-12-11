package ppppselenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindow {

	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set <String> aw=driver.getWindowHandles();
	//	System.out.println(aw);
		
	ArrayList<String> ar=new ArrayList(aw);
    String parent=ar.get(0);
	String child=ar.get(1);

	driver.switchTo().window(parent);
	boolean dd=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	System.out.println(dd);
	
	driver.switchTo().window(child);
	boolean aa=driver.findElement(By.xpath("//img[@alt='OrangeHRM Logo']")).isDisplayed();
	System.out.println(aa);
	
	}

}
