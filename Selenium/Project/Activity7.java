package selenium_activity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity7 {
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
	public void createJobs() {
		  //open browser, open portal, navigate to post a job

		driver.findElement(By.xpath("//a[(text()='Post a Job')]")).click();
		
		WebElement your_email=driver.findElement(By.id("create_account_email"));
		int min = 200;  
		int max = 400;
		int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
		String gen_email="nidhi"+random_int+"@gmail.com";
		your_email.sendKeys(gen_email);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		WebElement job_title=driver.findElement(By.id("job_title"));
		job_title.sendKeys("Automation");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		Select job_type= new Select(driver.findElement(By.id("job_type")));
		job_type.selectByVisibleText("Temporary");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.switchTo().frame("job_description_ifr");
		WebElement description=driver.findElement(By.xpath("//body[@id=\"tinymce\"]"));
		description.sendKeys("this is an automation job");
		driver.switchTo().defaultContent();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		WebElement application= driver.findElement(By.id("application"));
		application.sendKeys("https://alchemy.hguy.co/jobs/post-a-job/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		WebElement company_name=driver.findElement(By.id("company_name"));
		company_name.sendKeys("IBM");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		WebElement preview=driver.findElement(By.xpath("//input[@value=\"Preview\"]"));
		preview.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		WebElement submit_listing=driver.findElement(By.id("job_preview_submit_button"));
		submit_listing.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		//verify if job is posted
		driver.findElement(By.xpath("//a[(text()=\"Jobs\")]")).click();
		driver.findElement(By.id("search_keywords")).sendKeys("Automation");
		String company_verify=driver.findElement(By.xpath("//ul[@class='job_listings']//li//a[1]//img")).getAttribute("alt");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		boolean flag= company_verify.contains("IBM");
      Assert.assertEquals(flag, true);

	}	
	@AfterMethod
	public void afterMethod() {
		 driver.close();
		System.out.println("Finished Test On Chrome Browser");
		

}
}
