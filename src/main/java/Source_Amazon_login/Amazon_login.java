package Source_Amazon_login;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_login {
           // WebDriver driver;
	  @FindBy(id="nav-link-accountList-nav-line-1")
	  WebElement hovertobutton;
	  
	  @FindBy(xpath="//span[@class=\"nav-action-inner\"]")
	  WebElement loginbutton;

       @FindBy(name="email")
       WebElement email;
       
       @FindBy(className = "a-button-input")
           WebElement continuebutton;
       
       @FindBy(id="ap_password")
       WebElement password;

       @FindBy(id="signInSubmit")
       WebElement signinbutton;
       
       
       public void hoverbutton(WebDriver driver)
       {
    	  Actions A1 = new Actions(driver);
    	  A1.moveToElement(hovertobutton).perform();;
       }
        
      public void clickonlogin()
      {
    	  loginbutton.click(); 
      }

      public void email()
      {
    	  email.sendKeys("rushikeshpowar3@gmail.com");
      }

 public void clickoncontinuebutton()
 {
	 continuebutton.click(); 
 }
 
  public void password() 
  {
	  password.sendKeys("7769983872");
  }

 public void signinbuuton()
 {
	 signinbutton.click();
 }

   public Amazon_login(WebDriver driver) 
   {
	   PageFactory.initElements(driver, this);
   }



}
