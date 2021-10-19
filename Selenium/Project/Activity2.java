package selenium_activity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {
	WebDriver driver ;
	@BeforeMethod
	public void openBrowser() {
		System.out.println("Starting Test On Firefox Browser");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		String baseUrl = "https://alchemy.hguy.co/jobs/"; 
        System.out.println("Launching job board website");
        driver.get(baseUrl);
	}
	@Test
    public void headingCheck() {
	String heading= driver.findElement(By.xpath("//h1[@class='entry-title']")).getText(); 
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	String expectedHeading="Welcome to Alchemy Jobs";
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	Assert.assertEquals(heading, expectedHeading);
 }
	

	@AfterMethod
	public void afterMethod() {
		 driver.close();
		System.out.println("Finished Test On Chrome Browser");
		
}
	
}
