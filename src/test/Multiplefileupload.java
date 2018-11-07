package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplefileupload {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\automation\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/upload");
		driver.findElement(By.id("file-upload")).click();
		Runtime.getRuntime().exec("E:\\automation\\Autoit\\Workspace\\multiplefileupload.exe"+" "+"E:\\automation\\new.xlsx");
		Thread.sleep(9000);
		driver.navigate().to("http://demo.guru99.com/test/upload/");
		//driver.get("http://demo.guru99.com/test/upload/");
		driver.findElement(By.name("uploadfile_0")).click();
		Runtime.getRuntime().exec("E:\\automation\\Autoit\\Workspace\\multiplefileupload.exe"+" "+"E:\\Uploads\\resume.pdf");
		

	}

}
