package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page extends Runpagefactory {


	public static WebDriver driver;
	  
	  @FindBy(xpath="//*[@name='search_query' and @type='text']")
	  public static WebElement search;
	  
	  @FindBy(name="submit_search")
	  public static WebElement clicksearch;
  
  
  public static void search(String a)
  {
	  search.sendKeys(a);
	  clicksearch.click();
	  
  }
  
 
  
}


