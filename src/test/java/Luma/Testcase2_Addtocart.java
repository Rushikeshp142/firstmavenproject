package Luma;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase2_Addtocart extends Launch_Quit
{
	@Test
	public void testcase2() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Luma_Addtocart KK= new Luma_Addtocart(driver); 
          KK.clickmen(driver);
          KK.clicktop(driver);
          KK.clickhoodies();
          JavascriptExecutor ff = driver;
          ff.executeScript("window.scrollBy(0,300)");
          Thread.sleep(2000);
          KK.clicksize();
          KK.clickcolor();
          Thread.sleep(2000);
          KK.clickaddtocart();
          Thread.sleep(4000);
          JavascriptExecutor ff1 = driver;
          ff1.executeScript("window.scrollBy(0,-300)");
          KK.clickoncartbutton();
          Thread.sleep(3000);
          KK.clickproccedtocheckout();
          Thread.sleep(4000);
          KK.clicksigninbutton();
          Thread.sleep(2000);
          KK.Login();
          KK.inputmail();
          KK.inputpd();
          KK.clickonsignin();
         // KK.clicknewaddress();
//          Thread.sleep(4000);
//          KK.inputaddress();
//          Thread.sleep(4000);
//          KK.inputcity();
//          Thread.sleep(4000);
//          KK.selectprovince();
//          Thread.sleep(4000);
//          KK.inputzip();
//          Thread.sleep(4000);
//          KK.inputphone();
//          KK.clickshiphere();
          Thread.sleep(4000);
          JavascriptExecutor ff2 = driver;
          ff2.executeScript("window.scrollBy(0,300)");
          KK.selectshippingcost();
          Thread.sleep(4000);
          KK.clickonnext();
          Thread.sleep(2000);
          KK.clickonplaceorder();
          
          
         
              WebElement assertion =       driver.findElement(By.xpath("//span[text()=\"Continue Shopping\"]"));
          Assert.assertEquals(assertion.isDisplayed(), true, "Is not displayed");
		
	}

}
