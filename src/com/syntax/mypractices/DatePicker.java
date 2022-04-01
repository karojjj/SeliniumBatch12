package com.syntax.mypractices;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        //setting up chrome driver
        WebDriver driver=new ChromeDriver();
        //navigate to web
        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement datePick= driver.findElement(By.id("datepicker"));
        datePick.sendKeys("10/10/2022");
       // datePick.sendKeys(Keys.RETURN);
        Thread.sleep(2000);
        driver.quit();
    }
}
