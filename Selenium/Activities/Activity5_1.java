package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {
	public static void main(String[] args){
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("toggled")).click();
		if(driver.findElement(By.name("toggled")).isDisplayed()) {
			System.out.println("Checkbox is displayed");	
		}
		else
		{
			System.out.println("Checkbox is NOT displayed");
		}
		driver.findElement(By.id("toggleCheckbox")).click();
		if(driver.findElement(By.name("toggled")).isDisplayed()) {
			System.out.println("Checkbox is displayed");	
		}
		else
		{
			System.out.println("Checkbox is NOT displayed");
		}
}
}