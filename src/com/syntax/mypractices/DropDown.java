package com.syntax.mypractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/dropdown");
        WebElement dropdown= driver.findElement(By.id("dropdownMenuButton"));
        dropdown.click();
        Thread.sleep(2000);
        WebElement autocomplete= driver.findElement(By.id("autocomplete"));
        Thread.sleep(2000);
        autocomplete.click();

        driver.quit();
    }
}
