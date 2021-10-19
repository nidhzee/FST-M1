package Selenium;


import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new FirefoxDriver();
driver.get("https://www.training-support.net");
System.out.println(driver.getTitle());
driver.findElement(By.xpath("//a[@id=\"about-link\"]")).click();
Thread.sleep(1000);
System.out.println(driver.getTitle());

}
}