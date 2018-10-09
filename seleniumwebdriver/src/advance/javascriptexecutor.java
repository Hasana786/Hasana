package advance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class javascriptexecutor {


public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Selium 3.0\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.allstate.com");
	driver.manage().window().maximize();
	    
		
		
		// how to get title of the webpage using javascript
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String sText =  js.executeScript("return document.title;").toString();
		System.out.println(sText);
		
		
		//how to click a button in Selenium WebDriver using JavaScript

		WebElement contact_icon = driver.findElement(By.linkText("Contact Us"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", contact_icon );
	

		
		//execute a alert popup window using javascript

		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("alert('hello world');", driver.findElement(By.xpath(".//*[@id='s_Text']")));



	}




		

	}


