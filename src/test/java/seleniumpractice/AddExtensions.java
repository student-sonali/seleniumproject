package seleniumpractice;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AddExtensions {

	public static void main(String[] args) 
	{
		ChromeOptions option=new ChromeOptions();
		File file= new File("C:\\Users\\Lenovo\\Downloads\\New folder\\SelectorsHub-XPath-Helper-Chrome-Web-Store.crx");
		option.addExtensions(file);
		WebDriver driver= new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		

	}

}
