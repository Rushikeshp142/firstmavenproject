package Crossbrowsing;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Fblogin {
	WebDriver driver;
	  @Test
	  @Parameters("browser")
	public void logintofb(String nameofthebrowser)
	{
		  if (nameofthebrowser.equals("chrome")) {
		     driver = new ChromeDriver();
		  }
		  if (nameofthebrowser.equals("edge")) {
			     driver = new EdgeDriver();
			  }
		 
		
		  
		 driver.get("https://www.facebook.com/");
		   WebElement email = driver.findElement(By.name("email"));
            email.sendKeys("rushikesh3rs@gmail.com");
            WebElement password = driver.findElement(By.name("pass"));
            password.sendKeys("9054353423");
            WebElement loginbutton = driver.findElement(By.name("login"));
            loginbutton.click();
	}

}
