package com.jayant.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by jayant on 1/23/2016.
 */
public class SampleTestNGTest {

    public String baseURL = "http://newtours.demoaut.com/mercuryregister.php";
    public WebDriver driver;

    @BeforeTest
    public void setBaseURL()    {
        driver = new FirefoxDriver();
        driver.get(baseURL);
    }

    @Test
    public void verifyHomepageTitle()   {
        String expectedTitle = "Register: Mercury Tours";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @AfterTest
    public void endSession() {
        driver.quit();
    }

}
