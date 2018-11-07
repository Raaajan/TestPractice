package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demoqapractice {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\automation\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demoqa.com/");
		Actions a= new Actions(driver);
		driver.findElement(By.xpath("//*[@id='menu-item-140']")).click();
		WebElement dragsrc= driver.findElement(By.xpath("//*[@id='draggable']/child::p"));
		
		a.clickAndHold(dragsrc);
		Thread.sleep(5000);
		a.dragAndDropBy(dragsrc, 500, 500).build().perform();
	
	
	
	
	
	
	
	
	
	
	
	//driver.close();
	}

}
