package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW2 {
    public static String url="https://syntaxprojects.com/bootstrap-iframe.php";
    public static void main(String[] args) throws InterruptedException {
        //Navigate to https://syntaxprojects.com/bootstrap-iframe.php
        //verify the header text Sorry, We Couldn't Find Anything For “Asksn” is displayed
        //verify enroll today button is enabled
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().window().maximize();
        driver.get(url);

        String expectedHeader="AUTOMATION TESTING PLATFORM BY SYNTAX";
        WebElement text=driver.findElement(By.xpath("//span[text()='AUTOMATION TESTING PLATFORM BY SYNTAX']"));
        if(expectedHeader.equals(text.getText())){
            System.out.println("header is just matched!");
        } else{
            System.out.println("header is not matching");
        }
        Thread.sleep(1000);

        //how to find total numbers of frames in a web page?
        List<WebElement> allFrames=driver.findElements(By.tagName("iframe"));
        System.out.println("the frame size in the web page are "+allFrames.size());

        WebElement enrolFrame= driver.findElement(By.name("FrameTwo"));
        driver.switchTo().frame(enrolFrame);
        // by classname, css selector we could not find our elements , found more elements which are not unique
        if(driver.findElement(By.linkText("Enroll today")).isEnabled()){
            System.out.println("enroll button successfully is displayed on the webpage");

        }else{
            System.out.println("enroll button is not displayed on the webpage");
        }

            driver.quit();
    }
}
