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

public class Activity6 {
	WebDriver driver ;
	@BeforeMethod
	public void openBrowser() {
		System.out.println("Starting Test On Chrome Browser");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		String baseUrl = "https://alchemy.hguy.co/jobs/"; 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
        System.out.println("Launching job board website");
        driver.get(baseUrl);
	}
	@Test	
	public void applyForJobs() {
		  //open browser, open portal, navigate to jobs
		driver.findElement(By.xpath("//a[(text()=\"Jobs\")]")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.id("search_keywords")).sendKeys("Automation");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("//input[@value='Search Jobs']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("(//ul[@class='job_listings']//li//a)[2]")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("//input[@value=\"Apply for job\"]")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		String email=driver.findElement(By.xpath("//div[@class=\"application_details\"]//a")).getText();
		System.out.println(email);
}	
	@AfterMethod
	public void afterMethod() {
		 driver.close();
		System.out.println("Finished Test On Chrome Browser");
		

}
}
