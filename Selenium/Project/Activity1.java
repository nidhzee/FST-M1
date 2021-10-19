package selenium_activity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
	WebDriver driver ;
	@BeforeMethod
	public void openBrowser() {
		System.out.println("Starting Test On Firefox Browser");
		driver = new FirefoxDriver();
		String baseUrl = "https://alchemy.hguy.co/jobs/"; 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
        System.out.println("Launching job board website");
        driver.get(baseUrl);
	}
	@Test
	public void titleCheck() {
	  
	        String testTitle = "Alchemy Jobs – Job Board Application";
	        String originalTitle = driver.getTitle();
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	        Assert.assertEquals(originalTitle, testTitle);
	        
	}
	

	@AfterMethod
	public void afterMethod() {
		 driver.close();
		System.out.println("Finished Test On Firefox Browser");
	}
}
