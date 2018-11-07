package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Annotationc1 {
/*  @Test
  public void c1f1() {
  System.out.println("c1f1");
  }
  @Test
  public void c1f2() {
	  System.out.println("c1f2");
  }*/
  @Test
  public void c2f3() {
	  System.out.println("c2f3");
	
  }
  
  @BeforeMethod
  public void c1beforeMethod() {
	  System.out.println("c1beforeMethod");	  
  }

  @AfterMethod
  public void c1afterMethod() {
	  System.out.println("c1afterMethod");
  }

 /* @BeforeClass
  public void c1beforeClass() {
	  System.out.println("c1beforeClass");
  }

  @AfterClass
  public void c1afterClass() {
	  System.out.println("c1afterClass");
  }

  @BeforeTest
  public void c1beforeTest() {
	  System.out.println("c1beforeTest");
  }

  @AfterTest
  public void c1afterTest() {
	  System.out.println("c1afterTest");
  }
  
  @BeforeSuite
  public void c1beforeSuite() {
	  System.out.println("c1beforeSuite");
  }

  @AfterSuite
  public void c1afterSuite() {
	  System.out.println("c1afterSuite");
  }
*/
}
