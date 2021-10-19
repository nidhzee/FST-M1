package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_2 {
	public static void main(String[] args){
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		System.out.println(driver.getTitle());
	String name= "nidhi123";
		driver.findElement(By.xpath("//h2//div[contains(text(),\"Sign Up!\")]//..//following-sibling::div[@class=\"field\"]//input[@type=\"text\"]")).sendKeys(name);
		driver.findElement(By.xpath("//h2//div[contains(text(),\"Sign Up!\")]//..//following-sibling::div[@class=\"field\"]//following-sibling::input[@placeholder=\"Password\"]")).sendKeys("abcdef");
		
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("nidhi123@gmail.com");
		driver.findElement(By.xpath("//h2//div[contains(text(),\"Sign Up!\")]//..//following-sibling::div[@class=\"field\"]//following-sibling::input[@placeholder=\"Password\"]//..//following-sibling::div//input[@placeholder=\"Password\"]")).sendKeys("abcdef");
		driver.findElement(By.xpath("//button[contains(text(),\"Sign Up\")]")).click();
		WebDriverWait wait= new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.textToBe((By.id("action-confirmation")),"Thank you for registering, "+name));
		System.out.println(driver.findElement(By.id("action-confirmation")).getText());
		driver.close();
		System.out.println("Closed the browser");
}
}
