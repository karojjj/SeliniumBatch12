package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW1 {
    /*
    TC 1: Facebook dropdown verification ==>Open chrome browser
Go to “https://www.facebook.com”
click on create new account
Verify:month dd has 12 month options day dd has 31 day option year dd has 115 year options
Select your date of birth ==>Quit browser
     */
    public static String url="https://www.facebook.com";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().fullscreen();
        WebElement createAccount= driver.findElement(By.partialLinkText("Create New Account"));
        createAccount.click();
        WebElement month= driver.findElement(By.cssSelector("select[id='month']"));
        Select monthDayDate=new Select(month);
        if(monthDayDate.isMultiple()){
            List<WebElement> options=monthDayDate.getOptions();
            if(options.size()==12){
                System.out.println("12 months");
            }else{
                System.out.println("do not have 12 months options");
            }
        }
        WebElement year= driver.findElement(By.cssSelector("select[id='year']"));
        Select yearD=new Select(year);


    }
}
