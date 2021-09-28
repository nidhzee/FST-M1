package Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
       driver.findElement(By.id("firstName")).sendKeys("Nidhi");
       driver.findElement(By.id("lastName")).sendKeys("Singh");
        driver.findElement(By.id("email")).sendKeys("test@example.com");
        driver.findElement(By.id("number")).sendKeys("123456");
        driver.findElement(By.cssSelector("input.ui.green.button")).click();
        driver.close();
    }
}
