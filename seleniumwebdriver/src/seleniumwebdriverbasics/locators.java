package seleniumwebdriverbasics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class locators {
	 WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.linkText("REGISTER")).click();
	  driver.findElement(By.name("firstName")).sendKeys("Hasana");
	  driver.findElement(By.name("lastName")).sendKeys("Abbas");
	  driver.findElement(By.name("phone")).sendKeys("8220531854");
	  driver.findElement(By.id("userName")).sendKeys("hasanafathima200@gmail.com");
	  driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input")).sendKeys("No-133,santhiNagar");
	  driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("Palayamkottai");
	  driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Tirunelveli");
	  driver.findElement(By.cssSelector("input[name='state']")).sendKeys("Tamilnadu");
	  driver.findElement(By.name("postalCode")).sendKeys("627011");
	  Select country=new Select(driver.findElement(By.name("country")));
	  country.selectByValue("92");
	  driver.findElement(By.id("email")).sendKeys("hasanafathima200@gmail.com");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("kappuchin");
	  driver.findElement(By.cssSelector("input[name='confirmPassword']")).sendKeys("kappuchin");
	  driver.findElement(By.name("register")).click();
	  Assert.assertEquals(driver.getTitle(), "Register: Mercury Tours");
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Selium 3.0\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	 

  }

}
