package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Coordinates
{  
	public static void main(String args[])

	{
		System.setProperty("webdriver.chrome.driver", "E:\\automation\\driver\\Chromedriver_latest\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		WebElement logo = driver.findElement(By.xpath("//img[contains(@src,'http://automationpractice.com/img/logo.jpg')]"));		
		int x = logo.getSize().getHeight();
		int y=logo.getSize().getWidth();
		System.out.println("x= "+x+" "+"y= "+y);
		
	
		
		//driver.findElement(By.id("Search_query_top")).sendKeys("tops");
		
		
	}
}  