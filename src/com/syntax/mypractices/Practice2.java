package com.syntax.mypractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //to navigate the test page
        driver.get("https://formy-project.herokuapp.com/keypress");
        WebElement name=driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("medine kaya");
        Thread.sleep(2000);
       WebElement button= driver.findElement(By.id("button"));
       button.click();
       Thread.sleep(2000);


        //to close all the current page
        driver.quit();
    }
}
