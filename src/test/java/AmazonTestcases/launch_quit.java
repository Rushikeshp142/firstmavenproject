package AmazonTestcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Amazon_listeners.Amazonlisteners;

public class launch_quit extends Amazonlisteners

{ 
        @BeforeMethod
           
        public void launch()
        {
        	driver = new ChromeDriver();
        	driver.get("https://www.amazon.in/");
        	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        	driver.manage().window().maximize();
        	
        	
        }
        @AfterMethod
         public void close() throws InterruptedException
         {
        	 Thread.sleep(2000);
        	  driver.close();
        	 
         }


}
 



