package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) throws InterruptedException {
        //SET PROPERTY
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        //creating object of webdrive
        WebDriver driver=new ChromeDriver();
        //to navigate the specific URL
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
        //our xpath is //input[contains(@id, 'username')]
        //Maximize current window
        driver.manage().window().maximize();

        WebElement username=driver.findElement(By.xpath("//input[contains(@id, 'username')]"));
        //it's a web element and we can sendKeys
        username.sendKeys("Tester");

        //finding xpath for password ==> //input[@type= 'password']
        WebElement password= driver.findElement(By.xpath("//input[@type= 'password']"));
        password.sendKeys("test");

       WebElement loginButton= driver.findElement(By.xpath("//input[@value='Login']"));
       loginButton.click();
       Thread.sleep(1000);
       driver.quit();

    }
}
