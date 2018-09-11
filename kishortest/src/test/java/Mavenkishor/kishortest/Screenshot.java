package Mavenkishor.kishortest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\system8\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	
    	WebDriver driver=new ChromeDriver();
    	
    	driver.get("https://jqueryui.com");
    	
    	driver.manage().window().maximize();
    	
    	System.out.println("Page Title is : " +driver.getTitle());
    	
    	driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[2]/ul/li[2]/a")).click();
    	
    	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
    	
    	driver.findElement(By.id("tags")).sendKeys("kishor");
    	
    	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	
    	FileUtils.copyFile(src, new File(".\\src\\kishor.png"));
    	
    	Thread.sleep(3000);
    	
    	driver.close();
		

	}

}
