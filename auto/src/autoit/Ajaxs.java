package autoit;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Ajaxs {
	
	static File file;
	static FileOutputStream FOS;
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
    
    public static void main(String[] args) throws InterruptedException, AWTException, FileNotFoundException {
	
    	
    	file=new File("D:\\New folder\\123.xlsx");
    	FOS = new FileOutputStream(file);
    	wb = new XSSFWorkbook();
		sheet = wb.createSheet("Products");
		
		
		System.setProperty("webdriver.gecko.driver","D:\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jabong.com/");
		Thread.sleep(5000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(5000);
		Actions a=new Actions(driver);
		WebElement women=driver.findElement(By.xpath("//li[@class='nav-women']"));
		WebElement bags=driver.findElement(By.xpath("//li[1]/div/div[3]/div[2]/a[10]"));
		a.moveToElement(women).pause(2000).moveToElement(bags).click().build().perform();
		//List<WebElement>products=driver.findElements(By.xpath("//section[@class='row search-product animate-products']/div"));
		//System.out.println(products.size());
		Thread.sleep(5000);
		Ajaxs ewe = new Ajaxs();
		int i=1;
		int count=1;
		try {
		do {
			String item=driver.findElement(By.xpath("//section[@class='row search-product animate-products']/div["+i+"]//div[@class='product-info']/div[1]")).getText();
			System.out.println(i+">>>"+item);
			String price=driver.findElement(By.xpath("//section[@class='row search-product animate-products']/div["+i+"]//div[@class='product-info']/div[2]")).getText();
			System.out.println(">>>"+price);
			ewe.writeExcelData(count-1, item, price);
			i++;
			count++;
			for(int j=0;j<1;j++) {
				//Scroll up and down
				((RemoteWebDriver)driver).executeScript("window.scrollBy(0,150)", "");
				Thread.sleep(3000);
			}
		
		}
		while(i==count);
		}catch(Exception e) {
			System.out.println("Products Completed.Thank you.");
		}
		
		}
	
    public void writeExcelData(int rowno,String col1,String col2)
	{
		XSSFRow row=sheet.createRow(rowno);
		XSSFCell cell = row.createCell(0);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(col1);
		
		XSSFCell cell1 = row.createCell(1);
		cell1.setCellType(cell1.CELL_TYPE_STRING);
		cell1.setCellValue(col2);
	}
	
	
		
	

	

}
