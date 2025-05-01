package Luma;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase1_SignIn extends Launch_Quit

{

@Test
public void Testcase1() throws EncryptedDocumentException, IOException
{
	
	Luma_signin DD = new Luma_signin(driver);
	       DD.Login();
	       DD.sigininbutton();;
	       DD.inputemail();
	       DD.inputpassword();
	       DD.clickonsignin();
           WebElement loggedin=  driver.findElement(By.xpath("(//span[text()='Welcome, Rushikesh Powar!'])[1]"));
	         Assert.assertEquals(loggedin.isDisplayed(), true, "it is not displayed");
}

}
