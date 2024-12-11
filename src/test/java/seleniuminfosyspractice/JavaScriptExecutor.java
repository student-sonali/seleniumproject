package seleniuminfosyspractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args)
	{
WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
	    JavascriptExecutor js= (JavascriptExecutor)driver;
	    
	 //WebElement ss=   driver.findElement(By.id("male"));
     //  js.executeScript("arguments[0].click()", ss);
       
    // WebElement dd=  driver.findElement(By.id("name"));
     // js.executeScript("arguments[0].setAttribute ('value', 'sonali')", dd);
      
	  //  js.executeScript("document.body.style.zoom='50%'");
	    
	    //scrolling page
	    
	   // js.executeScript("window.scrollBy(0,1000)", " ");
	    
	   // js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
	    
	WebElement dd= driver.findElement(By.xpath("//h2[normalize-space()='Slider']"));
	js.executeScript("argument[0].scrollIntoview", dd);
	    
	    
	    
      
	}

}
