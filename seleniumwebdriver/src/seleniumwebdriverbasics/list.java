package seleniumwebdriverbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class list {
	WebDriver driver;

  @Test
  public void f() {
	  driver.findElement(By.name("userName")).sendKeys("hasanafathima200@gmail.com");
	  driver.findElement(By.name("password")).sendKeys("kappuchin");
	  driver.findElement(By.name("login")).click();
	  driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
	  driver.findElement(By.name("passCount")).sendKeys("4");
	  Select from=new Select(driver.findElement(By.name("fromPort")));
	  List<WebElement> list=from.getOptions();
	  for(WebElement e:list)
	  {
		  String city=e.getText();
		  if(city.equals("Paris"))
		  {
			  from.selectByValue(city);
			  break;
		  }
	  }
	  driver.findElement(By.name("fromMonth")).sendKeys("October");
	  Select date=new Select(driver.findElement(By.name("fromDay")));
	  date.selectByVisibleText("3");
	  Select arrival=new Select(driver.findElement(By.name("toPort")));
	  arrival.selectByIndex(3);
	  Select remonth=new Select(driver.findElement(By.name("toMonth")));
	  remonth.selectByValue("12");
	  driver.findElement(By.name("toDay")).sendKeys("1");
	  driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]")).click();
	  
	  driver.findElement(By.name("airline")).sendKeys("Blue Skies Airlines");
	  driver.findElement(By.name("findFlights")).click();
	 Assert.assertEquals(driver.getTitle(), "Select a Flight: Mercury Tours");
  
	  
	  
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