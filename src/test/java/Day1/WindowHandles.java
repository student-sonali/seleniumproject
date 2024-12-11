package Day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
        
     String s=  driver.getWindowHandle();
     System.out.println(s);
     
     Set <String>ww= driver.getWindowHandles();
     
    /* for(String winids:ww) 
     {
    	 String title=driver.switchTo().window(winids).getTitle();
    	 if(title.equals("OrangeHRM")) 
    	 {
    		 System.out.println(driver.getCurrentUrl());
    	 }
     }*/
     
     ArrayList <String>aa= new ArrayList(ww);
     String parent= aa.get(0);
     String child = aa.get(1);
     driver.switchTo().window(parent);
     boolean dd=   driver.findElement(By.name("username")).isDisplayed();
    System.out.println(dd);
    
    driver.switchTo().window(child);
    boolean xx= driver.findElement(By.name("EmailHomePage")).isEnabled();
    System.out.println(xx);
    
	}

}
