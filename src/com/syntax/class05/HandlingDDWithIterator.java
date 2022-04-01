package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDDWithIterator {
    public static String url="http://amazon.com";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get(url);
        WebElement departmentsDD=driver.findElement(By.id("searchDropdownBox"));
        Select select=new Select(departmentsDD);
    }
}
