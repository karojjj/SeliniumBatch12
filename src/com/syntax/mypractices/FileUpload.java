package com.syntax.mypractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/fileupload");

        WebElement upload= driver.findElement(By.id("file-upload-field"));
        upload.sendKeys("WhatsApp Image 2022-01-04 at 9.14.35 AM");
        Thread.sleep(2000);

        driver.quit();

    }
}
