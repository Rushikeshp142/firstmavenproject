package Luma;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Luma_Addtocart extends Luma_LoginData
{
	
	
	@FindBy(xpath = "//a[@id=\"ui-id-5\"]")
	WebElement Men;
	
	
	@FindBy(xpath = "//a[@id=\"ui-id-17\"]")
	WebElement Top;

	@FindBy(xpath =  "//a[@id=\"ui-id-20\"]")
	WebElement hoodies;
	
	@FindBy(xpath = "(//div[@id=\"option-label-color-93-item-53\"])[2]")
	WebElement color;

    @FindBy(xpath = "(//div[@class=\"swatch-option text\"])[7]")
    WebElement size;
   
     @FindBy(xpath = "(//span[text()=\"Add to Cart\"])[2]")
     WebElement Addtocart;
       
     @FindBy(xpath = "//a[@href=\"https://magento.softwaretestingboard.com/checkout/cart/\"]")
     WebElement cart;
     
     @FindBy(id = "top-cart-btn-checkout")
     WebElement proceedtocheckout;
     
     @FindBy(xpath =  "(//span[text()=\"Sign In\"])[1]")
     WebElement siginbutton;
     
     @FindBy(xpath ="//input[@id=\"login-email\"]")
      WebElement email;
     
     @FindBy(xpath ="//input[@id=\"login-password\"]")
     WebElement pwd;
     
     @FindBy(xpath = "(//span[text()=\"Sign In\"])[2]")
     WebElement signin;
     
     @FindBy(xpath="(//button[@type=\"button\"])[5]")
     WebElement newaddress;
     
     @FindBy(xpath ="(//input [@class=\"input-text\"])[9]")
     WebElement address;
     
     @FindBy(xpath="(//input [@class=\"input-text\"])[12]")
     WebElement City;
     
     @FindBy(xpath= "(//select[@class=\"select\"])[1]")
     WebElement province;
     
     @FindBy(xpath="(//input [@class=\"input-text\"])[14]")
     WebElement zip;
     
     @FindBy(xpath ="(//input [@class=\"input-text\"])[15]")
     WebElement phone;
     
     @FindBy(xpath="//span[text()=\"Ship here\"]")
     WebElement shiphere;
     
     @FindBy(xpath="//input[starts-with(@name,\"ko_\")][1]")
     WebElement  shippingcost; 
     
     @FindBy(xpath ="//span[text()=\"Next\"]")
     WebElement next;
     
     @FindBy(xpath="//span[text()=\"Place Order\"]")
     WebElement placeorder;
     
     public void clickmen(ChromeDriver driver)
     {
    	 Actions A1 = new Actions(driver);
            A1.moveToElement(Men).perform();;
     }
     
     public void clicktop (ChromeDriver driver)
     {
    	 Actions A2 = new Actions(driver);
    	 A2.moveToElement(Top).perform();;
     }

   public void clickhoodies()
   {
	   hoodies.click();   
   }

     public void clickcolor()
{
  color.click();	
}

   public void clicksize()
   {
	   size.click();
   }

   public void clickaddtocart()
   {
	   Addtocart.click();
   }

   public void clickoncartbutton()
   {
	   cart.click();
   }

public void clickproccedtocheckout()
{
	proceedtocheckout.click();
}

  public void clicksigninbutton()
  {
	  siginbutton.click();
	  
  }

  public void clicknewaddress()
  {
	  newaddress.click();
  }
  public void inputmail()
  {
	  email.sendKeys(Email1);
  }

  
  public void inputpd()
  {
	  pwd.sendKeys(Password);
  }
  
  
  public void clickonsignin()
  {
	  signin.click();
  }
   
  
  public void inputaddress()
  {
	  address.sendKeys("baner");
  }
  
 
  public void inputcity()
  {
       City.sendKeys("Pune");	  
  }
  
  
  public void selectprovince()
  {
  Select A1 = new Select(province);
  A1.selectByVisibleText("New York");
  }
  
  public void inputzip()
  {
	  zip.sendKeys("10002");
  }
  
  
  public void inputphone()
  {
	  phone.sendKeys("7768876753");
  }
  
  
  public void clickshiphere()
  {
	  shiphere.click();
  }
  
  public void selectshippingcost()
  {
	  shippingcost.click();
  }
  
  
  public void clickonnext()
  {
      next.click();
  }
  
  
  
  public void clickonplaceorder()
  {
	  placeorder.click();
  }
  
  public Luma_Addtocart(ChromeDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }


}
