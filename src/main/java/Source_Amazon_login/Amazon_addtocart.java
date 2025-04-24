package Source_Amazon_login;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_addtocart {
            WebDriver driver;
             @FindBy(id="twotabsearchtextbox")
             WebElement search;
             
             @FindBy(xpath="(//div[@class=\"a-section a-spacing-base\"])[3]")
             WebElement shoe;
	  
	          @FindBy(xpath="//input[@id=\"add-to-cart-button\"]")
	          WebElement addtocartbutton;
	          
	          @FindBy(name="proceedToRetailCheckout")
	          WebElement proccedtobuy;
	          
	          @FindBy(id="ap_email_login")
	            WebElement email;
	          
	          @FindBy(xpath="//input[@class=\"a-button-input\"]")
	          WebElement continuebutton;
	          
	          @FindBy(id="ap_password")
	          WebElement password;
	          
	          @FindBy(id="signInSubmit")
	          WebElement signbutton;
	          
	          
	          
	          @FindBy(xpath="(//div[@class=\"a-box-inner a-padding-small\"])[1]")
	           WebElement selectcard;
	          
	          @FindBy(linkText =  "Save Card")
	          WebElement   savecard;
	          
	          @FindBy(id="pp-cmA4bb-16")  
	          WebElement cardnumber;
	          
	          @FindBy(xpath="(//span[@class=\"a-dropdown-prompt\"])[1]")
	          WebElement expiryyear;
	          
	          @FindBy(xpath="(//li[@class=\"a-dropdown-item\"])[6]")
	          WebElement selectyear; 
	          
	          @FindBy(xpath="//span[@id=\"pp-cmA4bb-22\"]")
	           WebElement expirydate;
	          
	          @FindBy(xpath="(//li[@class=\"a-dropdown-item\"])[3]")
	          WebElement expirydates;
	          
	          @FindBy(xpath ="//span[@id=\"pp-cmA4bb-26\"]")
	          WebElement lastSavecard;
	          
	          
	          public void searchshoe()
	          {
	        	  search.sendKeys("shoes"+Keys.ENTER);
	          }
	          
	          public void selectshoe()
	          {
	        	  shoe.click();
	          }
	             
	          public void addtocart()
	          {
	        	  addtocartbutton.click();
	          }
	
	          public void proccedtobuy()
	          {
	        	  proccedtobuy.click();
	          }
	          
	          public void emailid()
	          {
	        	  email.sendKeys("rushikeshpowar3@gmail.com");
	          }
	          
	          public void continuebuttonc()
	          {
	        	  continuebutton.click();
	          }
	          
	          public void pwd()
	          {
	        	  password.sendKeys("Rushikesh@04");
	          }
	          
	          public void signinbutton()
	          {
	        	  signbutton.click();  
	          }
	          
	          
	         public void cardselect()
	         {
	        	 selectcard.click();
	         }
	         
	         public void clickonsavecard()
	         {
	        	 savecard.click();
	         }
	          
	         public void inputcardnumber()
	         {
	        	 cardnumber.sendKeys("6785676855");
	         }
	          
	          public void selectexyears()
	          {
	        	  expiryyear.click();
	          }
	          
	          public void selectoneyear()
	          {
	        	  expirydate.click();
	          }
	          
	          public void selectexpirydate()
	          {
	        	  expirydate.click();
	          }	          
	          
	          public void selectexpirydates()
	          {
	        	  expirydates.click();
	          }
	          
	          public void doclickonsavecard()
	          {
	        	  lastSavecard.click();
	          }
	          
	          
	          
	          
	          
	          
	          public Amazon_addtocart(WebDriver driver)
	         {
	        	 PageFactory.initElements(driver, this);
	         }
}
