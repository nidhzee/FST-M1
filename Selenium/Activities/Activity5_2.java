package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {
	public static void main(String[] args){
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		System.out.println(driver.getTitle());
		
		if(driver.findElement(By.name("toggled")).isSelected()) {
			System.out.println("Checkbox is selected");	
		}
		else
		{
			System.out.println("Checkbox is NOT Selected");
		}
		driver.findElement(By.name("toggled")).click();
		
		if(driver.findElement(By.name("toggled")).isSelected()) {
			System.out.println("Checkbox is selected");	
		}
		else
		{
			System.out.println("Checkbox is NOT selected");
		}
}
}
