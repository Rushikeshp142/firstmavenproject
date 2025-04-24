package Selenium.SeleniumProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file1 = new FileInputStream("C:\\Users\\rushi\\eclipse-workspace\\SeleniumProject\\DDT\\DDTTesting.xlsx");
        Workbook W1 =WorkbookFactory.create(file1);
        
     String title1     =W1.getSheet("Login").getRow(0).getCell(0).getStringCellValue();
          System.out.println(title1);
          String title2     =W1.getSheet("Login").getRow(0).getCell(1).getStringCellValue();
          System.out.println(title2);

ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
WebElement username = driver.findElement(By.name("email"));
username.sendKeys(title1);
WebElement password= driver.findElement(By.id("pass"));
password.sendKeys(title2);
WebElement loginbutton= driver.findElement(By.name("login"));
loginbutton.sendKeys(Keys.ENTER);

	}
	
	
	}


