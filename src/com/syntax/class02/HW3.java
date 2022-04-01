package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3 {
    public static void main(String[] args) throws InterruptedException {
        /*
        Launch the browser
        navigate amazon website
        printout the title and url on console
        close the browser
         */
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        String url= driver.getCurrentUrl();
        String title= driver.getTitle();
        if(title.equals("Amazon.com. Spend less. Smile more.")){
            System.out.println(url+" "+title);
        } else{
            System.out.println("title is not matched");
        }

        Thread.sleep(1000);
        driver.quit();

    }
}
