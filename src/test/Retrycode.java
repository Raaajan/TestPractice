package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Retrycode 
{
	@Test
	public void retry() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "E:\\automation\\chromedriver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.findElement(By.linkText("Sign in")).click();
	
	}
}
