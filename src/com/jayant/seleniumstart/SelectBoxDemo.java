package com.jayant.seleniumstart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by jayant on 1/23/2016.
 */
public class SelectBoxDemo {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        try {

            driver.get("http://newtours.demoaut.com/mercuryregister.php");
            Select drpCountry = new Select(driver.findElement(By.name("country")));
            drpCountry.selectByVisibleText("ANTARCTICA");
            System.out.println(drpCountry.isMultiple());

        } finally {
            driver.close();
        }
    }


}
