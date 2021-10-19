package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {
public static void main(String[] args){
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.training-support.net/selenium/simple-form");
	System.out.println(driver.getTitle());
	//enter firstname
	driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("Nidhi");
	//enter lastname
	driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("Singh");
	//enter email
	driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("test@gmail.com");
	//enter contact number
	driver.findElement(By.xpath("//input[@id=\"number\"]")).sendKeys("1234567890");
	//click on submit button
	driver.findElement(By.xpath("//input[@value=\"submit\"]")).click();
}
}
