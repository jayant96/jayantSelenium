package com.jayant.seleniumstart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by jayant on 1/23/2016.
 */
public class FileUploadDemo {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        try {
            driver.get("http://www.megafileupload.com/");
            WebElement uploadElement = driver.findElement(By.className("slider-btn-upload"));
            System.out.println(uploadElement.getAttribute("onclick"));
            uploadElement.click();
            driver.findElement(By.id("fileUpload")).sendKeys("C:\\Users\\jayan\\OneDrive\\Documents\\test.txt");

        } catch (Exception e)   {
            e.printStackTrace();
        } finally {
            driver.close();
        }


    }

}
