package autoit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Crossbrowser {

	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver","C:\\Users\\system8\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		
	Thread.sleep(2000);	
System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");

/*DesiredCapabilities capabilities = new DesiredCapabilities();

capabilities = DesiredCapabilities.firefox();
capabilities.setBrowserName("firefox");
capabilities.setVersion("47.0.1");
capabilities.setPlatform(Platform.WINDOWS);
capabilities.setCapability("marionette", false);*/

WebDriver driver1 = new FirefoxDriver();
//WebDriver driver1 = new FirefoxDriver();

driver1.get("https://maps.mapmyindia.com");

System.setProperty("webdriver.ie.driver", "D:\\Drivers\\IEDriverServer.exe");

WebDriver driver2=new InternetExplorerDriver();
driver2.get("https://jqueryui.com/selectable/");

		
		
		
	}

}
