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

public class googletest {
  @Test
  public void f() {
	  System.out.println("googletest");
  }
  @BeforeMethod
  public void beforeMethod() {
      System.out.println("googlebeforemethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("googleaftermethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("googlebeforeclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("googleafterclass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("googlebeforetest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("googleaftertest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("googlebeforesuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("googleaftersuite");
  }

}
