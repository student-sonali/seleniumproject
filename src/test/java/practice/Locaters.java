package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locaters 
{
	public static void main(String[]args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobile");
		//driver.findElement(By.id("nav-search-submit-button")).click();
	WebElement element=	driver.findElement(By.id("searchDropdownBox"));
		Select ss=new Select(element);
		//ss.selectByVisibleText("Books");
		//driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		//ss.selectByIndex(3);
		//ss.selectByValue("search-alias=computers-intl-ship");
	if(	ss.isMultiple()) 
	{
		System.out.println("Dropdown is multiple");
	}
	else
	{
		System.out.println("Dropdown is not multiple");
		
	}
	List<WebElement>ele=ss.getOptions();
	System.out.println(ele.size());
	for(WebElement el:ele) 
	{
		System.out.println(el.getText());
	}
	
	}

}
