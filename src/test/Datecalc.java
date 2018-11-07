package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Wait;

public class Datecalc {

	public static void main(String[] args) 
	{
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat formater= new SimpleDateFormat("dd_MMM_yyyy_hh_mm_a");
		Date time = cal.getTime();
		String formatedtime = formater.format(time);
		System.out.println(formatedtime);
		
	
		
	
	
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // implicit wait
		
		//WebDriverWait wait= new WebDriverWait(driver,10); //explicit wait
		//wait.until(ExpectedConditions.elementToBeClickable(e)).click(); // e= webelement
		
		// fluent wait
		//FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(10, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		
		
		
	
	
	
	}

}
