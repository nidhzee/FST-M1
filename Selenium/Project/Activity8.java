package selenium_activity;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity8 {
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
	public void login() {
		driver.get("https://alchemy.hguy.co/jobs/wp-admin");
		driver.findElement(By.id("user_login")).sendKeys("​root");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.id("wp-submit")).click();
		
		String username=driver.findElement(By.xpath("//a[@class='ab-item']//span[@class=\"display-name\"]")).getText();
		System.out.println(username);
		 Assert.assertEquals(username, "root");
	}	
	@AfterMethod
	public void afterMethod() {
		 driver.close();
		System.out.println("Finished Test On Firefox Browser");
	
}
}
