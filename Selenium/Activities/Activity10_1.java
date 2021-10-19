package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        Actions actions = new Actions(driver);
        driver.get("https://www.training-support.net/selenium/input-events");
        WebElement element = driver.findElement(By.id("wrapD3Cube"));
        actions.click(element);
        WebElement elementVal = driver.findElement(By.className("active"));
        System.out.println("Left Click: " + elementVal.getText());
        actions.doubleClick(element).perform();
        elementVal = driver.findElement(By.className("active"));
        System.out.println("Double Click: " + elementVal.getText());        
        actions.contextClick(element).perform();
        elementVal = driver.findElement(By.className("active"));
        System.out.println("Right Click: " + elementVal.getText());
        driver.close();
    }
}