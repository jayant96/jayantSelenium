package com.jayant.seleniumstart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by jayant on 1/17/2016.
 */
public class PopupDemo {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://jsbin.com/usidix/1");
        driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
        String alertMessage = driver.switchTo().alert().getText();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.switchTo().alert().accept();
        System.out.println("alertMessage = " + alertMessage);
        driver.close();
    }
}
