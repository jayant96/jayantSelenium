package com.jayant.seleniumstart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by jayant on 1/23/2016.
 */
public class MultiSelectDemo {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        try {
            driver.get("http://jsbin.com/osebed/2");
            Select multiSelect = new Select(driver.findElement(By.id("fruits")));
            multiSelect.selectByVisibleText("Banana");
            multiSelect.selectByIndex(1);

        } finally {
            driver.close();
        }
    }


}
