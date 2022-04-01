package com.syntax.Reviewclass;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        //Creating instantiate  of objects and variables the driver
        WebDriver driver = new ChromeDriver();
        //launching  a web browser
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        WebElement femaleRadioButton= driver.findElement(By.xpath("//input[@name='optradio'and@value='Female']"));
        femaleRadioButton.click();
        //check if the radio button is enabled!!!

       femaleRadioButton.isEnabled();
        System.out.println("the female radio button is displayed"+femaleRadioButton.isEnabled());
        //check if radio button is displayed!!!!
        femaleRadioButton.isDisplayed();

            System.out.println("the female radio button is displayed"+femaleRadioButton.isDisplayed());

        //check if radio button is selected or not
        femaleRadioButton.isSelected();
        System.out.println("the female radio button is selected"+femaleRadioButton.isSelected());
        //to get all links in the current webpage
        List<WebElement> link=driver.findElements(By.tagName("a"));
        System.out.println(link.size()+" link size");
        for(WebElement links:link){
         String name=   links.getText();
            System.out.println(name);
            if(!name.isEmpty()){
                System.out.println(name);
            }

            driver.quit();

        }

    }
}