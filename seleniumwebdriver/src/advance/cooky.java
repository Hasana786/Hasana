package advance;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class cooky {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selium 3.0\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		Cookie cooky=new Cookie("google", "search");
		driver.manage().addCookie(cooky);
		
		Set<Cookie> cooky_set=driver.manage().getCookies();
		for(Cookie temp_cookie : cooky_set)
		{
			System.out.println("Name of the cookie: "+temp_cookie.getName()+
			                   " and its value : "+temp_cookie.getValue()+
			                   " get domain : " +temp_cookie.getDomain()+
			                   " get path : " +temp_cookie.getPath()+
			                   " get expiry date : " +temp_cookie.getExpiry()+
			                   " is secure : " +temp_cookie.isSecure());
		
			                   
 		}
		driver.manage().deleteCookie(cooky);
		
	
		

	}

}
