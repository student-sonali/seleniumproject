package seleniuminfosyspractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadSingleFile {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("filesToUpload")).sendKeys("C:\\Users\\Lenovo\\Desktop\\New folder (2)\\sonali.txt");
		if(driver.findElement(By.xpath("//ul[@id='fileList']")).getText().equals("sonali.txt"))
		{
			System.out.println("file upload succesfully");
		}
		
		
	}

}
