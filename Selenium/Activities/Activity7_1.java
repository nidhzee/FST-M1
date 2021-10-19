package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_1 {
	public static void main(String[] args){
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		System.out.println(driver.getTitle());
	
		driver.findElement(By.xpath("//h2//div[contains(text(),\"Sign in!\")]//..//following-sibling::div[@class=\"field\"]//input[@type=\"text\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//h2//div[contains(text(),\"Sign in!\")]//..//following-sibling::div[@class=\"field\"]//following-sibling::input[@placeholder=\"Password\"]")).sendKeys("password");
		
		driver.findElement(By.xpath("//button[contains(text(),\"Log in\")]")).click();
		WebDriverWait wait= new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.textToBe((By.id("action-confirmation")),"Welcome Back, admin"));
		System.out.println(driver.findElement(By.id("action-confirmation")).getText());
		driver.close();
		System.out.println("Closed the browser");
}
}
