package AmazonTestcases;

import org.testng.annotations.Test;

import Source_Amazon_login.Amazon_profileupdate;

public class Testcase3_updateprofile extends launch_quit
{
	
@Test
	public void updateprofile()
{
	   Amazon_profileupdate hd = new Amazon_profileupdate(driver);
			   hd.accountandlists(driver);
			   hd.manageprofiles();
			   hd.clickonview();
			   hd.clickonpencil();
			   hd.inputnames();
			   hd.continuebutton();
}
}