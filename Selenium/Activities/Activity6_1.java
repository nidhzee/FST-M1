package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_1 {
	public static void main(String[] args){
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("toggleCheckbox")).click();
		WebDriverWait wait= new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.name("toggled"))));
		driver.findElement(By.id("toggleCheckbox")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("toggled"))));
		driver.close();
}
}