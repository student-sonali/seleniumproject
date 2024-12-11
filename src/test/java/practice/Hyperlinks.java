package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlinks {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.calculator.net/");
		
		driver.manage().window().maximize();
List<WebElement>	linklist=	driver.findElements(By.tagName("a"));
System.out.println("Count:" + linklist.size());
 
for(WebElement el:linklist) 
{
	System.out.println(el.getText());
	}
driver.quit();

	}

}
