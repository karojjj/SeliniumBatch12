package com.syntax;
//this coming from Selenium library
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        //first we need to set property of browser
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        //creating object of chrome driver
        //ChromeDriver is extend of RemoteDriver
        WebDriver driver=new ChromeDriver(); //it launches browser with blank url
        //to navigate to browser
        driver.get("https://www.google.de/");
        String url=driver.getCurrentUrl();
        System.out.println(url);
        String title= driver.getTitle();
        System.out.println(title);
        driver.quit();

    }
}
