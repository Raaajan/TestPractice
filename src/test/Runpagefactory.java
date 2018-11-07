package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Runpagefactory {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\automation\\driver\\Chromedriver_latest\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		PageFactory.initElements(driver, Page.class);
		Page.search("tops");

		System.out.println("execution complete");
		
	}

}
