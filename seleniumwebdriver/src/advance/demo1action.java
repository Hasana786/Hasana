package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class demo1action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selium 3.0\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/resources/demos/resizable/default.html");
		WebElement resize =driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		Actions action=new Actions(driver);
		action.dragAndDropBy(resize, 420, 377).build().perform();
		
		
		
		

	}

}
