package test;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class PhptravelPractice {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\automation\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		Thread.sleep(5000);
		WebElement nothanks=driver.findElement(By.xpath("//*[text()='No Thanks']"));
		/*WebDriverWait wait= new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(nothanks));*/
		nothanks.click();
		
		try
		{
		driver.findElement(By.xpath("//span[@id='minimize']")).click();
		}
		catch (Exception e)
		{
			System.out.println("window is already minimised " +e);
		}
		Actions a = new Actions(driver);
		WebElement feature=driver.findElement(By.xpath("//span[text()='Features']"));
		
		a.moveToElement(feature).build().perform();
		
		
		List<WebElement> value= (driver.findElements(By.xpath("//span[text()='Features']/following::div[1]/child::ul/child::li")));
		System.out.println("SIZE= "+value.size());
	
			for(int i=1;i<=value.size();i++)
			{
				WebElement e=driver.findElement(By.xpath("//span[text()='Features']/following::div[1]/child::ul/child::li["+i+"]"));
				Thread.sleep(1000);
				a.moveToElement(e).build().perform();
				System.out.println(e.getText());
			}
			
			
			
			List<WebElement> value1= (driver.findElements(By.xpath("//nav[@id='main-menu']/child::ul/child::li")));
			System.out.println("SIZE= "+value1.size());
		
				for(int i=1;i<=value1.size();i++)
				{
					WebElement e=driver.findElement(By.xpath("//nav[@id='main-menu']/child::ul/child::li["+i+"]"));
					Thread.sleep(1000);
					a.moveToElement(e).build().perform();
					System.out.println(e.getText());
				}
			
			driver.close();
	}

}
