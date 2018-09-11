package autoit;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Autoit {

	public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\system8\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://files.fm/");
		
		//Maximize
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		//Click on upload file link
		driver.findElement(By.xpath("//*[@id=\"file_select_button\"]")).click();

		Thread.sleep(4000);
		
		//Executing my autoit exe
		Runtime.getRuntime().exec("C:\\Users\\system8\\Desktop\\AutoIt.exe C:\\Users\\system8\\Desktop\\classExP\\UploadEx1.txt");
	}

}

	

