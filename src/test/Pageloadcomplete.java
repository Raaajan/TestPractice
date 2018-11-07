package test;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pageloadcomplete {

	public static void main(String[] args)  
	{
		System.setProperty("webdriver.chrome.driver", "E:\\automation\\driver\\Chromedriver_latest\\chromedriver_2.42.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://zeenews.india.com/");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		for(int i=0;i<20;i++)
		{
		
			
			
			String state=js.executeScript("return document.readyState").toString();
		if(state.equals("complete"))
		{
			
			System.out.println("pageload complete");
			break;
		}
		else
		{
			System.out.println("page is still loading");
		}
			
		}	
			
		
		
		System.out.println("execution completed");
}
}
