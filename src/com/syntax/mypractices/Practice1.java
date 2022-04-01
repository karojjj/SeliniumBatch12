package com.syntax.mypractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
    public static void main(String[] args) {
        //set the property for "webdriver.chrome,driver" to be the location on your local download of chromedriver
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        //create new instance of ChromeDriver
        WebDriver driver=new ChromeDriver();
      //and now use this to visit google
        driver.get("https://www.google.de/");
        //find the text input element by its name
        WebElement element= driver.findElement(By.name("q"));
        //enter something to search for
        element.sendKeys("Cheese");
        //submit the form
        element.submit();
        //close the browser
        driver.quit();
    }
}
