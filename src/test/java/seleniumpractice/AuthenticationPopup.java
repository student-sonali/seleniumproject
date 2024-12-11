package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {

	public static void main(String[] args)
	{
		WebDriver driver=  new ChromeDriver();
		driver.manage().window().maximize();
		//we pass username and password along with the url
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		

	

	}
	}
