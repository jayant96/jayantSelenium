package com.jayant.seleniumstart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by jayant on 1/17/2016.
 */
public class FrameNavigationDemo {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://selenium.googlecode.com/svn/trunk/docs/api/java/index.html");
        driver.switchTo().frame("classFrame");
        driver.findElement(By.xpath("/html/body/div[1]/ul/li[5]")).click();
        driver.close();
        }
    }