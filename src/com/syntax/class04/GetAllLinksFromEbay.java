package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetAllLinksFromEbay {
    public static void main(String[] args) {
        //SETTTING PROPERTY
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        //CREATING A WEBDRIVER OBJECT
        WebDriver driver=new ChromeDriver();

        //NAVIGATING URL
        driver.get("https://www.ebay.com/");

        //STORING ALL WEB ELEMENTS IN THE LIST OF WEBELEMENTS
        List<WebElement> allLinks=driver.findElements(By.tagName("a"));
        //TO FIND OUT HOW MANY ELEMENTS WE HAVE WE WILL USE size(); method, it will return us integer type
        System.out.println("number of links :"+allLinks.size()); //it returns integer type 406

        for (WebElement link :allLinks){
        String linkText= link.getText();
        String fullLink=link.getAttribute("href");
        if(!linkText.isEmpty()){
          System.out.println(linkText+"  "+fullLink);

      }
    }
}}
