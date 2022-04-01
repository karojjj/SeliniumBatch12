package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {
        /*
        navigate to fb.com
        click on create new account
        fill up all the textboxes
        click on sign up button
         close the pop up
         close the browser
         */
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize(); //maximizing the page
        driver.get("https://www.facebook.com/"); //navigating to fb

      driver.findElement(By.partialLinkText("Create new account")).click();
      Thread.sleep(2000);

     driver.findElement(By.name("firstname")).sendKeys("medine");

     driver.findElement(By.name("lastname")).sendKeys("kaya");

     driver.findElement(By.name("reg_email__")).sendKeys("123456789");
     driver.findElement(By.id("password_step_input")).sendKeys("1283930Kahas");
     driver.findElement(By.name("wesubmmit")).click();

     Thread.sleep(2000);
     driver.findElement(By.id("u_f_s_QD")).click();
     driver.quit();

    }
}
