package Source_Amazon_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_profileupdate {
	
	WebDriver driver;
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement accountsandlist;

    @FindBy(xpath= "//button[@class='sc-fqkvVR sc-fTFjTM jZunJN eqmAHp']")
    WebElement manageprofile;

       @FindBy(xpath = "(//a[@class='sc-iGgWBj sc-fHjqPf fErbOa bdPZUm'])")
       WebElement view;
       
       
       @FindBy(xpath="//span[@class='editProfile']")
       WebElement pencil;

   @FindBy(xpath= "//input[@id='editProfileNameInputId']")
   WebElement inputname;

   @FindBy(xpath = "((//input[@class='a-button-input'])[3])")
   WebElement continuebutton;


   public void accountandlists(WebDriver driver)
   {
	   Actions A1 = new Actions(driver);
			   A1.moveToElement(accountsandlist);
			   
   }

 public void manageprofiles() 
 {
	 manageprofile.click();
 }

 public void clickonview()
 {
	 view.click();
	 
 }
  
 public void clickonpencil()
 {
	 pencil.click();
 }

public void inputnames()
  {
	inputname.sendKeys("Rushikesh Powar");
  }

public void continuebutton()
{
continuebutton.click();	
}


  public Amazon_profileupdate( WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }

	
}





