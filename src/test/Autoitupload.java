package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoitupload {

	public static void main(String[] args) throws IOException 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\automation\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/upload");
		driver.findElement(By.id("file-upload")).click();
		Runtime.getRuntime().exec("E:\\automation\\Autoit\\Workspace\\the-internet.herokuapp_upload_pdf.exe");
	}

}
