package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
	driver.findElement(By.className("btn btn-black navbar-btn")).click();
		 WebElement element=driver.findElement(By.id("input-country"));
		Select dropdown=new Select(element);
		dropdown.selectByVisibleText("China");

	}

}
