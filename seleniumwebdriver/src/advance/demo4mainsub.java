package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo4mainsub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selium 3.0\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions main=new Actions(driver);
		WebElement mainmenu=driver.findElement(By.xpath("//*[@id='nav-link-shopall']/span[2]"));
		main.moveToElement(mainmenu).build().perform();
		WebElement submenu=driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[2]/span[9]/span"));
		main.moveToElement(submenu).click(submenu).build().perform();
		
	}

}
