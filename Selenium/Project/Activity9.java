package selenium_activity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity9 {
	WebDriver driver ;
	@BeforeMethod
	public void openBrowser() {
		System.out.println("Starting Test On Firefox Browser");
		driver = new FirefoxDriver();
		String baseUrl = "https://alchemy.hguy.co/jobs/"; 
        System.out.println("Launching job board website");
        driver.get(baseUrl);
	}
	@Test	
	public void publish() {
		driver.get("https://alchemy.hguy.co/jobs/wp-admin");
		driver.findElement(By.id("user_login")).sendKeys("​root");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.id("wp-submit")).click();
		driver.findElement(By.name("_job_location")).sendKeys("London");
		driver.findElement(By.name("_company_website")).sendKeys("https://ibm.com");
		driver.findElement(By.name("_company_twitter")).sendKeys("@ibm");
		driver.findElement(By.name("_company_name")).sendKeys("IBM");
		driver.findElement(By.xpath("//button[contains(text(),\"Publish\")]")).click();
	}	
	@AfterMethod
	public void afterMethod() {
		 driver.close();
		System.out.println("Finished Test On Firefox Browser");
	
}
}
