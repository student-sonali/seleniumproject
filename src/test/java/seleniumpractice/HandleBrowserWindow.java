package seleniumpractice;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandleBrowserWindow {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
 Set  <String> windowlist=    driver.getWindowHandles();
 
 //System.out.println(windowlist);
 
 /*ArrayList<String> list= new ArrayList(windowlist);
String parent= list.get(0);
String child= list.get(1);
driver.switchTo().window(child);
Thread.sleep(5000);
boolean dd=driver.findElement(By.xpath("//select[@name='locale']")).isDisplayed();
System.out.println(dd);
driver.switchTo().window(parent);
 boolean cc=driver.findElement(By.name("username")).isEnabled();
 System.out.println(cc);*/
 
 for(String winid:windowlist) 
 {
	String title= driver.switchTo().window(winid).getTitle();
	if(title.equals("Human Resources Management Software | OrangeHRM")) 
	{
		System.out.println(driver.getCurrentUrl());
	}
	 
 }
	}

}
