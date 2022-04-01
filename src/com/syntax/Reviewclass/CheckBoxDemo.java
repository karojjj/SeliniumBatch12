package com.syntax.Reviewclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

class CheckBoxDemo{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        //Creating instantiate  of objects and variables the driver
        WebDriver driver = new ChromeDriver();
        //launching  a web browser
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");

        //check the check box
        WebElement checkbox1 = driver.findElement(By.cssSelector("input#isAgeSelected"));
        System.out.println("the checkbox is selected = "+checkbox1.isSelected());
        checkbox1.click();
        Thread.sleep(3000);
        checkbox1.click();
        WebElement message = driver.findElement(By.id("txtAge"));
        System.out.println(message.getText());
        //get all the available  options
       List<WebElement> checkbox=driver.findElements(By.xpath("//input[@class='cb1-element']"));
       //use eah for loop
        for(WebElement checkboxes:checkbox){
            checkboxes.click();

        }
    }
    }
