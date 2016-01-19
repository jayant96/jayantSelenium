package com.jayant.seleniumstart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by jayant on 1/17/2016.
 */
public class SeleniumFirst {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://newtours.demoaut.com";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        //launch Firefox and direct it to the Base Url
        driver.get(baseUrl);

        actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle))   {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        driver.close();
    }




}
