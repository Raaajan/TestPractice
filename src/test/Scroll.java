package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Scroll {

	public static WebDriver driver;
	public Object executeScript(String script) 
	{
		JavascriptExecutor exe = (JavascriptExecutor) driver;
	//	Log.info(script);
		return exe.executeScript(script);
	}

	public Object executeScript(String script, Object... args) {
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		//Log.info(script);
		return exe.executeScript(script, args);
	}

	public void scrollToElemet(WebElement element) {
		executeScript("window.scrollTo(arguments[0],arguments[1])", element.getLocation().x, element.getLocation().y);
		//Log.info(element);
	}

	public void scrollToElemetAndClick(WebElement element) {
		scrollToElemet(element);
		element.click();
		//Log.info(element);
	}

	public void scrollIntoView(WebElement element) {
		executeScript("arguments[0].scrollIntoView()", element);
		//Log.info(element);
	}

	public void scrollIntoViewAndClick(WebElement element) {
		scrollIntoView(element);
		element.click();
		//Log.info(element);
	}

	public void scrollDownVertically() {
		executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public void scrollUpVertically() {
		executeScript("window.scrollTo(0, -document.body.scrollHeight)");
	}

	public void scrollDownByPixel() {
		executeScript("window.scrollBy(0,1500)");
	}

	public void scrollUpByPixel() {
		executeScript("window.scrollBy(0,-1500)");
	}

	public void ZoomInBypercentage() {
		executeScript("document.body.style.zoom='40%'");
	}

	public void ZoomBy100percentage() {
		executeScript("document.body.style.zoom='100%'");
	}


	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\automation\\chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		Scroll sc= new Scroll();
		sc.scrollIntoView(driver.findElement(By.xpath("//*[text()='Come Visit Us']")));
		//Thread.sleep(1000);
		//sc.scrollUpVertically();
		//Thread.sleep(1000);
		//sc.scrollToElemet(driver.findElement(By.xpath("//*[text()='Women']")));
		Thread.sleep(1000);
		driver.close();
	
	}

}
