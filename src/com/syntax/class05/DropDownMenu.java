package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownMenu {
    public static String url="https://www.syntaxprojects.com/basic-select-dropdown-demo.php";
    public static void main(String[] args) throws InterruptedException {
        //dropdwon is a menu which gives us an opportunity to select one or more operations
        //types are; single select and multiple select
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get(url);
        WebElement daysDD= driver.findElement(By.id("select-demo"));
        Select select=new Select(daysDD);
        select.selectByIndex(3);//indexing starts from 0
        Thread.sleep(1000);
        select.selectByVisibleText("Thursday");
        select.selectByValue("Sunday");
//whenever you interact with multiple elements you store them inside the container such as List, Set..
        driver.manage().window().fullscreen();
        List<WebElement> allOptions=select.getOptions();
        int size= allOptions.size();
        System.out.println(size);
        for(int i=0; i<= allOptions.size(); i++){
            String option=allOptions.get(i).getText(); //get text for each element
            System.out.println(option);
            //or we can print like the below
           // System.out.println(allOptions.get(i).getText());
             select.selectByIndex(i);
             Thread.sleep(1000);

        }





        driver.quit();

    }
}
