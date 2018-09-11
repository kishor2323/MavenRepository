package autoit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_Get_Position_Methods {
	

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\system8\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.jabong.com/men-apparel");
		System.out.println("Position is   ="+driver.manage().window().getPosition());
		System.out.println("PositionX is   ="+driver.manage().window().getPosition().getX());
		System.out.println("PositionY is   ="+driver.manage().window().getPosition().getY());
		System.out.println("---------------------------------------------");
		System.out.println("Size is   ="+driver.manage().window().getSize());
		System.out.println("Size Height is   ="+driver.manage().window().getSize().getHeight());
		System.out.println("Size Width is   ="+driver.manage().window().getSize().getWidth());
		System.out.println("Size Height  is   ="+driver.manage().window().getSize().getHeight());
		Thread.sleep(3000);
		
		Point row = new Point(500, 300);
		driver.manage().window().setPosition(row);
		
		Thread.sleep(3000);
		
		Dimension d = new Dimension(500,350);
		
		 driver.manage().window().setSize(d);
		 

	}

}
