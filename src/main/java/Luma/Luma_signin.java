package Luma;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Luma_signin extends Luma_LoginData

{
	
	
	@FindBy(xpath="(//div[@class=\"panel header\"]/ul/li)[2]")
	WebElement signin;

	
	@FindBy(id= "email")
	WebElement email;
	
	@FindBy(id="pass")
	WebElement password;
	
      @FindBy(id="send2")
      WebElement clicksignin;


      public void sigininbutton()
      {
    	  signin.click();
      }

       public void inputemail()
       {
    	   email.sendKeys(Email1);
       }

   public void inputpassword()
   {
            password.sendKeys(Password);	   
   }

   public void clickonsignin()
   {
	   clicksignin.click();
   }


   public Luma_signin(ChromeDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
}
