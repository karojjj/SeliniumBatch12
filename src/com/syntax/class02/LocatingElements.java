package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        //launching browser
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        //after manual testing automation starts..
        //.findElement(By.by()); focus on only one element
        driver.findElement(By.id("email")).sendKeys("syntax@adnsn.com");
        //it
        driver.findElement(By.id("pass")).sendKeys("1234596"); //it gives error if we add passContainer
        // : element not intractable
        // in order to click login button
        driver.findElement(By.name("login")).click();
        // to make slower page display like 2 sec
        Thread.sleep(2000);
        //both method can be use
       driver.findElement(By.linkText("Forgot password?")).click();
     //  driver.findElement(By.partialLinkText("Forgot")).click();
        Thread.sleep(1000);
       driver.quit();
    }
}
