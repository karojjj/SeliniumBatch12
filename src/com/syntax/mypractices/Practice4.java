package com.syntax.mypractices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://live.browserstack.com/dashboard#os=iOS&os_version=10.0&device_browser=safari&zoom_to_fit=true&full_screen=true&url=www.browserstack.com%2Fwelcome&speed=1");
        String url=driver.getTitle();
        if(url==url){
            System.out.println("url is correct");
        }else {
            System.out.println("edit url");
        }
        System.out.println(url);
        driver.close();
    }
}
