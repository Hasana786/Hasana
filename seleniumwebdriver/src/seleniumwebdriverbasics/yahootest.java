package seleniumwebdriverbasics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class yahootest {
	@Test
	  public void f() {
		  System.out.println("yahootest");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
	      System.out.println("yahoobeforemethod");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("yahooaftermethod");
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("yahoobeforeclass");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("yahooafterclass");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("yahoobeforetest");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("yahooaftertest");
	  }

	  //@BeforeSuite
	  //public void beforeSuite() {
		 // System.out.println("yahoobeforesuite");
	  //}

	 // @AfterSuite
	  //public void afterSuite() {
		 // System.out.println("yahooaftersuite");
	  //}
}
