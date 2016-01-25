package com.jayant.seleniumstart;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by jayant on 1/23/2016.
 */
public class MutipleActions {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        try {
            driver.get("http://www.facebook.com");
            WebElement txtUserName = driver.findElement(By.id("email"));
            Actions builder = new Actions(driver);
            Action seriesOfAction = builder
                    .moveToElement(txtUserName)
                    .click()
                    .keyDown(txtUserName, Keys.SHIFT)
                    .sendKeys(txtUserName, "hello")
                    .keyUp(txtUserName, Keys.SHIFT)
                    .doubleClick(txtUserName)
                    .contextClick()
                    .build();
            seriesOfAction.perform();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            driver.close();
        }


    }



}
