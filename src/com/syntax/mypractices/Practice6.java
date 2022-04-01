package com.syntax.mypractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice6 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe"); //setting system property
        WebDriver driver=new ChromeDriver();
        Thread.sleep(1000);
        driver.get("https://formy-project.herokuapp.com/switch-window");
        Thread.sleep(1000);

        WebElement newTabButton= driver.findElement(By.id("new-tab-button"));
        newTabButton.click();
        Thread.sleep(1000);
        String originalHandle= driver.getWindowHandle();
         for (String handle : driver.getWindowHandles()){
             driver.switchTo().window(handle);
         }
         driver.switchTo().window(originalHandle);
        Thread.sleep(2000);
           driver.quit();
    }
}

