package selenium_activity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Activity4 {
	WebDriver driver ;
	@BeforeMethod
	public void openBrowser() {
		System.out.println("Starting Test On Firefox Browser");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		String baseUrl = "https://alchemy.hguy.co/jobs/"; 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
        System.out.println("Launching job board website");
        driver.get(baseUrl);
	}
	@Test
	public void heading() {
		String text=driver.findElement(By.xpath("//h2")).getText();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	Assert.assertEquals(text, "Quia quis non");
	}
	
	@AfterMethod
	public void afterMethod() {
		 driver.close();
		System.out.println("Finished Test On Chrome Browser");
		
}
}
