package seleniumwebdriverbasics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class windows {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://privacy.google.com/intl/en/your-data.html");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  String parent_window=driver.getWindowHandle();
	  System.out.println("The TITLE OF THE PARENT WINDOW IS - "+parent_window);
	  driver.findElement(By.linkText("Privacy Policy")).click();
	  
	  Set<String> s1=driver.getWindowHandles();
	  Iterator<String> i1=s1.iterator();
	
	  while(i1.hasNext())
	  {
		  String child_window=i1.next();
		  if(!parent_window.equalsIgnoreCase(child_window))
		  {
			  driver.switchTo().window(child_window);
			  System.out.println("THE TITLE OF THE CHILD WINDOW IS - "+driver.getTitle());
			  driver.close();
		  }
		  
	  }
	  
	  driver.switchTo().window(parent_window);
	  System.out.println("After switching to the parent window the title is - "+driver.getTitle() );
	  
	  
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
