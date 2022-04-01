package com.syntax.mypractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Practice3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/autocomplete");
        WebElement autocomplete= driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("440 Sea Street , Quincy, MA, 02169, USA");
        Thread.sleep(1000);
        WebElement autocompleteResult=driver.findElement(By.className("pac-item"));
        autocompleteResult.click();
        driver.quit();
    }}