package advance;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selium 3.0\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
	    driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("mercury");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File fil=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fil,new File("./screenshots/newtours.png"));
		System.out.println("Screenshots taken successfully");
		

	}

}
