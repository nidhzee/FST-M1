package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {
	public static void main(String[] args){
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/ajax");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//button[contains(text(),\"Change Content\")]")).click();
		WebDriverWait wait= new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.textToBe((By.xpath("//h1")),"HELLO!"));
		System.out.println(driver.findElement(By.xpath("//h3")).getText());
		wait.until(ExpectedConditions.textToBe((By.xpath("//h3")),"I'm late!"));
		System.out.println(driver.findElement(By.xpath("//h3")).getText());
		driver.close();
		System.out.println("Closed the browser");
}
	}
