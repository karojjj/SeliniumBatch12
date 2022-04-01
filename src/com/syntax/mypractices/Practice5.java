package com.syntax.mypractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe"); //setting system property
        WebDriver driver=new ChromeDriver();
        Thread.sleep(1000);
        driver.get("https://formy-project.herokuapp.com/scroll");
        Thread.sleep(1000);
        WebElement name= driver.findElement(By.id("name"));
        name.sendKeys("Medine Kaya");
        Thread.sleep(1000);
        WebElement date= driver.findElement(By.id("date"));
        date.sendKeys("09/09/1991");
        Thread.sleep(1000);
        driver.quit();
    }
}
