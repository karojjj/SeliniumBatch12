package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        /*
        navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
         fill out the form
         click on register
         close the browser
         */
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("medine");
        driver.findElement(By.id("customer.lastName")).sendKeys("kaya");
        driver.findElement(By.name("customer.address.street")).sendKeys("123 street");
        driver.findElement(By.id("customer.address.city")).sendKeys("Boston");
        driver.findElement(By.id("customer.address.state")).sendKeys("MA");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("02169");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("123456710");
        driver.findElement(By.id("customer.ssn")).sendKeys("234782722");
        driver.findElement(By.id("customer.username")).sendKeys("karoj");
        driver.findElement(By.id("customer.password")).sendKeys("123459");
        driver.findElement(By.id("repeatedPassword")).sendKeys("123459");
        driver.findElement(By.className("button")).click();
        Thread.sleep(1000);
        driver.quit();

    }
}
