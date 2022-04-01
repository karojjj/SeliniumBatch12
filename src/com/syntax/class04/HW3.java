package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3 {
    /*
    HRMS Application Negative Login:
Open chrome browser
Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
Enter valid username
Leave password field empty
Click on login button
Verify error message with text "Password cannot be empty" is displayed.
     */
    public static void main(String[] args) throws InterruptedException {
        //launcihing system property for chrome driver
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        //creating a driver object referencing webdriver is interface and instantiating driver object
        WebDriver driver=new ChromeDriver();
        //using get() method to open a webpage
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().fullscreen();
        WebElement username= driver.findElement(By.cssSelector("input#txtUsername"));
        username.sendKeys("Admin");
        Thread.sleep(1000);
        WebElement password=driver.findElement(By.cssSelector("input#txtPassword"));
        password.clear();
        Thread.sleep(1000);

        WebElement login = driver.findElement(By.cssSelector("[id^='btnLogin']"));
        login.click();
        //CSS SELECTOR SYNTAX: starts-with method [attributename ^='attribute value']
        if ((driver.findElement(By.cssSelector("span[id ^= 'spanMessage']"))).getText().equals("Password cannot ")){
            System.out.println("Error message is displayed");
        }else{
            System.out.println("Password cannot be empty");
        }

        Thread.sleep(2000);
        driver.quit();

    }
}
