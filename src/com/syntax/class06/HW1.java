package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static String url="https://syntaxprojects.com/javascript-alert-box-demo.php";
    public static void main(String[] args) throws InterruptedException {
        //Go to https://syntaxprojects.com/javascript-alert-box-demo.php
        //click on each button and handle the alert accordingly
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(1000);

        WebElement alertBox= driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        alertBox.click();
        Alert alertBoxx=driver.switchTo().alert();
        Thread.sleep(2000);
        alertBoxx.accept(); //handling alertbox

        WebElement confirmBox= driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']"));
        confirmBox.click();
        Alert confirmBoxx=driver.switchTo().alert();
        Thread.sleep(2000);
        confirmBoxx.accept(); // //handling alertbox

        WebElement promptBoxAlert= driver.findElement(By.cssSelector("button[onclick='myPromptFunction()']"));
        promptBoxAlert.click();
        Alert prompy=driver.switchTo().alert();
        prompy.sendKeys("hello bea :)");
        Thread.sleep(2000);
        prompy.accept();

        driver.quit();
    }
}
