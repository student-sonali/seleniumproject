package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/alm/storefront?almBrandId=ctnow&ref_=nav_cs_grocery");
	WebElement element=	driver.findElement(By.id("twotabsearchtextbox"));
	Actions ac=new Actions(driver);
		ac.contextClick(element).perform();

	}

}
