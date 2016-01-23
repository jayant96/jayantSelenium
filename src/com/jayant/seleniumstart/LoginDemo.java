package com.jayant.seleniumstart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by jayant on 1/22/2016.
 */
public class LoginDemo {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait myWaitVar = new WebDriverWait(driver, 10);

        try {
            driver.get("http://www.facebook.com");

            myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));

            driver.findElement(By.name("email")).sendKeys("abc");
            driver.findElement(By.name("email")).clear();
            driver.findElement(By.name("email")).sendKeys("jayanttech96@gmail.com");
            driver.findElement(By.name("pass")).sendKeys("hell123");

            WebElement checkbox = driver.findElement(By.className("uiInputLabelCheckbox"));

            for(int i = 0; i < 2; i++)  {
                checkbox.click();
                System.out.println("checkbox = " + checkbox.isSelected());
            }

            driver.findElement(By.id("u_0_n")).click();

            driver.findElement(By.id("userNavigationLabel")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            //TODO : code

            driver.findElement(By.xpath(".//*[@id='u_7_1']/div/div/div[1]/div/div/ul/li[12]/a/span/span")).click();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.close();
        }
    }



}
