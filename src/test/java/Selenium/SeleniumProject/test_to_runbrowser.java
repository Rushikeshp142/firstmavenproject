package Selenium.SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_to_runbrowser {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://grotechminds.com/automate-me/");
	}

}
