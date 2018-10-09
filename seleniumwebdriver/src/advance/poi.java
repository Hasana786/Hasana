package advance;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class poi {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		File has=new File("C:\\Selium 3.0\\Book1.xlsx");
		FileInputStream fil=new FileInputStream(has);
		XSSFWorkbook wb=new XSSFWorkbook(fil);
		XSSFSheet sht=wb.getSheetAt(0);
		
		
		
		//creating a new cell and entering the value
		
		sht.getRow(0).createCell(2).setCellValue("pass");
		sht.getRow(1).createCell(2).setCellValue("pass");
		sht.getRow(2).createCell(2).setCellValue("pass");
		FileOutputStream fo=new FileOutputStream(has);
		wb.write(fo);
		
//	for (int i = 0; i < 3; i++) {
//		
//	
//		String user=sht.getRow(i).getCell(0).getStringCellValue();
//		String pass=sht.getRow(i).getCell(1).getStringCellValue();
//		
//		System.out.println(user);
//		System.out.println(pass);
//		
//		System.setProperty("webdriver.chrome.driver","C:\\Selium 3.0\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//	    driver.get("http://newtours.demoaut.com/");
//		driver.findElement(By.name("userName")).sendKeys(user);
//	    driver.findElement(By.name("password")).sendKeys(pass);
//		driver.findElement(By.name("login")).click();
//		
//		
//	}
		
	}

}
