package seleniumwebdriverbasics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class framebyindex {
	 WebDriver driver;
  @Test
  public void f() {
	  driver.navigate().to("file://10.237.3.16/training$/Selium%203.0/iframe.htm");
	  int size=driver.findElements(By.tagName("iframe")).size();
	  System.out.println("THE SIZE OF THE FRAME IS-"+size);
	  driver.switchTo().frame(0);
	  System.out.println(driver.findElement(By.xpath("/html/body/h1")).getText());
	  System.out.println(driver.findElement(By.id("subframe")).getText());
	  
	  driver.switchTo().defaultContent();
	  
	  driver.switchTo().frame("iframe3");
	  System.out.println(driver.findElement(By.xpath("/html/body/h1")).getText());
	  driver.findElement(By.linkText("Google")).click();
	 
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Selium 3.0\\chromedriver.exe");
			driver=new ChromeDriver();
			
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
