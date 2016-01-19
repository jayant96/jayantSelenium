package com.jayant.seleniumstart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by jayant on 1/17/2016.
 */
public class FindElementBasic {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://www.facebook.com";
        String tagName = "";

        driver.get(baseUrl);
        tagName = driver.findElement(By.id("email")).getTagName();
        System.out.println("tagName = " + tagName);

        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);

        System.out.println("current url : " + driver.getCurrentUrl());
        System.out.println("get title : " + driver.getTitle());

        driver.navigate().refresh();
        driver.navigate().to("http://www.google.com");
        System.out.println(driver.getTitle());

        driver.close();
    }


}
