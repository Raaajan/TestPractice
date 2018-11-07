package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dateselectionjavascript {

	@org.testng.annotations.Test
	public  void Test() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\automation\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		
		WebElement date=driver.findElement(By.id("ctl00_mainContent_txt_Fromdate"));
		date.click();
		
		
		String datevalue="10-12-2018";
		
		selectdatebyjs(driver,date,datevalue);
		
	}
	
		public static  void selectdatebyjs(WebDriver driver, WebElement date,String datevalue)
		{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+datevalue+"');",date);
		}
			
}	
		
		
