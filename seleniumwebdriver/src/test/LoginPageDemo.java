package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPageDemo {

	public static void main(String args[])
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Selium 3.0\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		
		Pages.LoginPage login=new Pages.LoginPage(driver);
		login.get();
		login.typeUsername("tutorial");
		login.typePassword("tutorial");
	 	login.clickonSubmit();
	 	
		
	}
}
