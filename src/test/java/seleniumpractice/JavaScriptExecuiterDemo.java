package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuiterDemo
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//for sendkey method
     //   WebElement input=driver.findElement(By.id("name"));
        JavascriptExecutor js= (JavascriptExecutor)driver; //typecasting
      //  js.executeScript("arguments[0].setAttribute('value','sonali')",input);
        
        //click () method is not working
      // WebElement cli= driver.findElement(By.id("male"));
       // js.executeScript("arguments[0].click()",cli);
        
        //scrolling page by pixel number
     /*   js.executeScript("window.scrollBy(0,1000)","");
        System.out.println(js.executeScript("return window.pageYOffset;"));*/
        
        //scroll the page till element is visible
      /*  WebElement dd= driver.findElement(By.xpath("//input[@class='wikipedia-search-input']"));
        js.executeScript("arguments[0].scrollIntoView()", dd );
        System.out.println(js.executeScript("return window.pageYOffset;"));*/
        
        //scroll page till end of page
      //  js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        
       Thread.sleep(5000);
        //scrolling upto initial position
      //  js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
        
        
        //zoom page
        js.executeScript("document.body.style.zoom='50%'");
        Thread.sleep(5000);
        
        js.executeScript("document.body.style.zoom='100%'");
        
        
	}
	
	

}
