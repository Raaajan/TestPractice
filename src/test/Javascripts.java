package test;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascripts {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\automation\\driver\\Chromedriver_latest\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.linkText("Sign in")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,1000)");
		//WebElement createemail = driver.findElement(By.xpath("//h3[contains(text(),'Create an account')]"));
		//js.executeScript("arguments[0].scrollIntoView();",createemail);
		Thread.sleep(5000);
		js.executeScript("document.getElementById('search_query_top').value='radsfggj@gmail.com';");
		js.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red;');",driver.findElement(By.name("search_query")));
		js.executeScript("alert('Text highlighted');");
		Thread.sleep(10000);
		
		driver.close();
	
	}

}
	