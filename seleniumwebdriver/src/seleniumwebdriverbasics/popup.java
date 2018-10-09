package seleniumwebdriverbasics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class popup {
	WebDriver driver;
  @Test
  public void f() {
	  driver.navigate().to("file://10.237.3.16/training$/Selium%203.0/popup.htm");
	  driver.navigate().refresh();
	  driver.manage().window().maximize();
	  String title=driver.getTitle();
	  System.out.println("The title of the page is "+title);
	  
	  driver.findElement(By.name("popup")).click();
	  
	  Alert pop=driver.switchTo().alert();
	  System.out.println("The message in the popup window is "+pop.getText());
	  driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	  pop.accept();
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
