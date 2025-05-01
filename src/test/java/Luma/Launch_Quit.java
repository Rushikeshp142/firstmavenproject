package Luma;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch_Quit extends Luma_listener

{

	
	@BeforeMethod
	public void Launch()
	{
           driver = new ChromeDriver();		
	       driver.get("https://magento.softwaretestingboard.com/");
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	
	}

    @AfterMethod
    public void quit() throws InterruptedException 
    {
    	Thread.sleep(2000);
   	    // driver.close();
    }



}
