package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo3clickhold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selium 3.0\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.allstate.com");
		Actions clickhold=new Actions(driver);
		WebElement contact=driver.findElement(By.linkText("Contact Us"));
		clickhold.clickAndHold(contact).release(contact);;
		clickhold.build().perform();

	}

}
