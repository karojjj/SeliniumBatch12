package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.uitestpractice.com/Students/Form");
       WebElement marriedRadioButton= driver.findElement(By.xpath("(//input[@name = 'optradio'])[1]"));
       boolean isMarriedButtonEnabled=marriedRadioButton.isEnabled();
        System.out.println(isMarriedButtonEnabled);
        if (!isMarriedButtonEnabled){ //! mean not
            System.out.println("not enabled");
        }else{
            System.out.println("enabled!");
        }
       boolean isMarriedButtonDisplayed=marriedRadioButton.isDisplayed();
        System.out.println(isMarriedButtonDisplayed);

        boolean isMarriedButtonSelected=marriedRadioButton.isSelected();
        System.out.println("before clicking "+ isMarriedButtonSelected);
        marriedRadioButton.click();
        isMarriedButtonSelected=marriedRadioButton.isSelected();
        System.out.println("after clicking  "+isMarriedButtonSelected);
        driver.quit();
    }
}
