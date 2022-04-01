package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://fb.com");
        driver.manage().window().maximize();
        String title= driver.getTitle();
        System.out.println(title);
        String expectedTitle="Facebook - Log In or Sign Up";
        if (title.equals(expectedTitle)){
            System.out.println("title is correct");
        }else{
            System.out.println("title is not correct");
        }
        driver.quit();// it will close all the browser

    }
}
