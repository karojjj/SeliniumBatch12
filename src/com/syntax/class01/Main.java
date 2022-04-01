package com.syntax;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //set system property --  System.setProperty(key, value)
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver(); //launch the browser
/*
Launch a Browser Session
WebDriver's get() method is used to launch a new browsersession and directs it to the URL that you specify as its
parameter
 */
        driver.get("https://www.google.com/"); //navigate to the specified URL
        String url= driver.getTitle();
        System.out.println(url);
        driver.close();
    }
}
