package seleniumwebdriverbasics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class framebyname {
	WebDriver driver;
  @Test
  public void f() {
	  driver.navigate().to("file://10.237.3.16/training$/Selium%203.0/iframe.htm");
	  driver.switchTo().frame("iframe3");
	  driver.findElement(By.linkText("Google")).click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Selium 3.0\\chromedriver.exe");
		driver=new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
