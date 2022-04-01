package com.syntax.Reviewclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        //Creating instantiate  of objects and variables the driver
        WebDriver driver=new ChromeDriver();
        //launching  a web browser
        driver.get("https://demoqa.com/text-box");
        //navigate provides the opprt to go back and forward. navigate does not fully wait for it to load
       // driver.navigate.to("https://www.gmail.com");
      WebElement userName= driver.findElement(By.id("userName"));
      userName.sendKeys("Medine Kaya");
      WebElement email=driver.findElement(By.id("userEmail"));
      email.sendKeys("meddd.mk@gmail.com");
      WebElement address= driver.findElement(By.id("currentAddress"));
      address.sendKeys("449 shs street Quincy MA ");
      WebElement permAddress= driver.findElement(By.id("permanentAddress"));
      permAddress.sendKeys("449 shs street Quincy MA");

      WebElement submit= driver.findElement(By.id("submit"));
      submit.click();
      Thread.sleep(1000);
       driver.quit(); //it will close current browser

    }
}
