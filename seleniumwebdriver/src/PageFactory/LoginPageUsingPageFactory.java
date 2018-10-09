package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

public class LoginPageUsingPageFactory extends LoadableComponent<LoginPageUsingPageFactory>{

	WebDriver driver;
	public LoginPageUsingPageFactory(WebDriver driver)
	{
		this.driver=driver;
	}
	

	/*cachelookup is used to store the webelement in cache memory...whichever webelement is used frequently is stored in cache memory to quickly look and use it 
	instead of going to webpage, and performance will be high...and note the webelements which never changes only should be kept in cache*/
	
	
	
	@FindBy(how=How.NAME, using="userName")
	WebElement username;
	
	
	@FindBy(how=How.NAME, using="password")
	WebElement password;
	
	
	@FindBy(how=How.NAME,using="login")
	WebElement loginbutton;
	
		
	public void Loginuser(String uid, String pass)
	{
		username.sendKeys(uid);
		password.sendKeys(pass);
		loginbutton.click();
	}


	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		System.out.println("In loaded method");
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.startsWith("http://demo"),"Not on the issue entry page "+url);
		
	}


	@Override
	protected void load() {
		// TODO Auto-generated method stub
		System.out.println("In the load page");
		
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		
		
		
		
	}
	

}
