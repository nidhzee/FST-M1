package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {
	
	public static void main(String[] args){
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		System.out.println(driver.getTitle());
		
		if(driver.findElement(By.id("input-text")).isEnabled()) {
			System.out.println("Text box is enabled");	
		}
		else
		{
			System.out.println("Text box is NOT enabled");
		}
		driver.findElement(By.id("toggleInput")).click();
		
		if(driver.findElement(By.id("input-text")).isEnabled()) {
			System.out.println("Text box is enabled");	
		}
		else
		{
			System.out.println("Text box is NOT enabled");
		}
}
}
