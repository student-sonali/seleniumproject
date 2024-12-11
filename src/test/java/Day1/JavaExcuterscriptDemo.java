package Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaExcuterscriptDemo {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		
		//Thread.sleep(5000);
		
       // js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
		
		//js.executeScript("window.scrollBy(0,3000)");
		
		//WebElement w=driver.findElement(By.xpath("//input[@id='Form_submitForm_EmailHomePage']"));
	   //	js.executeScript("arguments[0].scrollIntoView()", w);
		
		
	 //  WebElement ww=driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]"));
	   //js.executeScript("arguments[0].click()", ww);
		
		WebElement w=driver.findElement(By.xpath("//input[@id='Form_submitForm_EmailHomePage']"));
		js.executeScript("arguments[0].setAttribute('value' ,'vivan')", w);
		
		
		js.executeScript("document.body.style.zoom='30%' ");
	}

}
