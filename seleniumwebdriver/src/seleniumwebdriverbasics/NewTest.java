package seleniumwebdriverbasics;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;


public class NewTest {
	WebDriver driver;

	
  @Test
  public void f() {
	 driver.findElement(By.id("lst-ib")).sendKeys("selenium");
     driver.findElement(By.name("btnK")).click();
	 driver.findElement(By.className("LC20lb")).click();
     driver.findElement(By.linkText("Download")).click();
  }
  @BeforeClass
  public void beforeClass() {
		System.setProperty("webdriver.chrome.driver","C:\\Selium 3.0\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
