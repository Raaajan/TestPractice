package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotationc2 extends Annotationc1{
	 @Test
	  public void c2f1() {
	  System.out.println("c2f1");
	  }
	  @Test
	  public void c2f2() {
		  System.out.println("c2f2");
	  }
	  @Test
	  public void c2f3() {
		  System.out.println("c2f3");
	  }
	 /* @BeforeMethod
	  public void c2beforeMethod() {
		  System.out.println("c2beforeMethod");	  
	  }

	  @AfterMethod
	  public void c2afterMethod() {
		  System.out.println("c2afterMethod");
	  }

	  @BeforeClass
	  public void c2beforeClass() {
		  System.out.println("c2beforeClass");
	  }

	  @AfterClass
	  public void c2afterClass() {
		  System.out.println("c2afterClass");
	  }

	  @BeforeTest
	  public void c2beforeTest() {
		  System.out.println("c2beforeTest");
	  }

	  @AfterTest
	  public void c2afterTest() {
		  System.out.println("c2afterTest");
	  }
	  
	  @BeforeSuite
	  public void c2beforeSuite() {
		  System.out.println("c2beforeSuite");
	  }

	  @AfterSuite
	  public void c2afterSuite() {
		  System.out.println("c2afterSuite");
	  }*/
}
