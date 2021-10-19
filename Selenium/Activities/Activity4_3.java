package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {
	public static void main(String[] args){
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
		System.out.println(driver.getTitle());
		//find third header
		driver.findElement(By.xpath("//h3[text()=\"Third header\"]"));
		//get color of fifth header
		System.out.println(driver.findElement(By.xpath("//h5[text()=\"Fifth header\"]")).getCssValue("color"));
		//find violet button and print class attribute
		System.out.println(driver.findElement(By.xpath("//button[contains(text(),\"Violet\")]")).getAttribute("class"));
		
		//finding the grey button with absolute xpath
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]"));
		
	}
}
