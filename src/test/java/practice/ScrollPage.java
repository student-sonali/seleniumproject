package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPage {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.calculator.net/");
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		Thread.sleep(3000);
		//js.executeScript("window.scrollBy(0,1000)");
	//WebElement element=	driver.findElement(By.linkText("BMI Calculator"));
	//	js.executeScript("arguments[0].scrollIntoView();",element);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

	}

}
