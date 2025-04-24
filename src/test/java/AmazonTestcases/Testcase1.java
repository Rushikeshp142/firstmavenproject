package AmazonTestcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Source_Amazon_login.Amazon_login;

public class Testcase1 extends launch_quit

{      
      @Test
      //@Parameters("browser")
      public void test1()
//           {  
//    	  if (nameofbrowser.equals("chrome")) 
//    	  {
//    		 driver = new ChromeDriver(); 
//    	  }
//    	  if (nameofbrowser.equals("edge")) 
//    	  {
//    		 driver = new EdgeDriver(); 
//    	  }if (nameofbrowser.equals("firefox")) 
//    	  {
//    		 driver = new FirefoxDriver(); 
//    	  }
              {
    	 
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
    	  Amazon_login DD = new Amazon_login( driver);
    	   DD.hoverbutton(driver);
    	   DD.clickonlogin();
    	   DD.email();
    	   DD.clickoncontinuebutton();
    	   DD.password();
    	   DD.signinbuuton();
      
      
      }
}
