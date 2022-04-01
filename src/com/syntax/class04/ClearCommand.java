package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearCommand {
        public static void main(String[] args) throws InterruptedException {
            // //first we need to set property of browser
            System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
            // //creating object of chrome driver
            WebDriver driver=new ChromeDriver();
            //navigating the specific URL
            driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

            WebElement username=driver.findElement(By.id("ctl00_MainContent_username"));
            username.sendKeys("Tester");

            WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
            password.sendKeys("test");

            WebElement loginButton= driver.findElement(By.className("button"));

            Thread.sleep(2000);
            //clearing the text
            username.clear();
            password.clear();
            driver.quit();
        }
    }


