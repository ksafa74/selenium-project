package com.cydeo.tests.day04_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T4_staleElementReferenceException {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://practice.cydeo.com/abtest");

        WebElement cydeoLink = driver.findElement(By.xpath("//a[.='CYDEO']"));

        System.out.println("Before refresh: cydeoLink.isDisplayed(), expected true = " + cydeoLink.isDisplayed());

        driver.navigate().refresh();
        System.out.println("Refreshing the page...");

        cydeoLink = driver.findElement(By.xpath("//a[.='CYDEO']"));
        System.out.println("After refresh: cydeoLink.isDisplayed(), expected true = " + cydeoLink.isDisplayed());

        
       /* try{
        System.out.println("Before refresh cydeoLink.isDisplayed(), expected true = " + cydeoLink.isDisplayed());}
        catch (StaleElementReferenceException e){
            System.out.println(e.getStackTrace());
        }*/



        driver.close();

    }
}
/*
TC #4: StaleElementReferenceException Task
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/abtest
3- Locate “CYDEO” link, verify it is displayed.
4- Refresh the page.
5- Verify it is displayed, again.
 */
