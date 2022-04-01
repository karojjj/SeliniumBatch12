package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    /*
    Open chrome browser
Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
Enter valid username and password (username - Admin, password - Hum@nhrm123)
Click on login button
Then verify Syntax Logo is displayed.
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        WebElement username= driver.findElement(By.xpath("//input[@id= 'txtUsername']"));
        username.sendKeys("Admin");
        WebElement password= driver.findElement(By.xpath("//input[@name= 'txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement login= driver.findElement(By.cssSelector("input#btnLogin"));
        login.click();
        WebElement logo= driver.findElement(By.cssSelector("img[src $='syntax.png']"));
        boolean isLogoDisplayed= login.isDisplayed();
        if(isLogoDisplayed){
            System.out.println("DISPLAYED!");
        }else{
            System.out.println("Not Displayed!");
        }
        driver.quit();
    }

}
