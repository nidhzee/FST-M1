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

public class Activity5 {
	WebDriver driver ;
	@BeforeMethod
	public void openBrowser() {
		System.out.println("Starting Test On Chrome Browser");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		String baseUrl = "https://alchemy.hguy.co/jobs/"; 
        System.out.println("Launching job board website");
        driver.get(baseUrl);
	}
	@Test	
	public void navigateJobs() {
		  
		driver.findElement(By.xpath("//a[(text()=\"Jobs\")]")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
        String testTitle1 = "Jobs – Alchemy Jobs";
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
        String originalTitle1 = driver.getTitle();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
        Assert.assertEquals(originalTitle1, testTitle1);
        
}

	
	@AfterMethod
	public void afterMethod() {
		 driver.close();
		System.out.println("Finished Test On Firefox Browser");
		

}
}