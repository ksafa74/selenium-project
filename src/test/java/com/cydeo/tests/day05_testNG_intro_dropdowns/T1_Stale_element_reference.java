package com.cydeo.tests.day05_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T1_Stale_element_reference {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://practice.cydeo.com/add_remove_elements/");

        WebElement addElementButton = driver.findElement(By.xpath("//button[@onclick='addElement()']"));

        addElementButton.click();

        WebElement deleteElementButton = driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));

        System.out.println("deleteElementButton.isDisplayed(), true to pass = " + deleteElementButton.isDisplayed());

        Thread.sleep(3000);;

        deleteElementButton.click();

        try{System.out.println("deleteElementButton.isDisplayed(), false to pass = " + deleteElementButton.isDisplayed());}
        catch (StaleElementReferenceException e){
            System.out.println("Test case Passed!");
        }

        driver.quit();

    }

}
/*
TC #1: StaleElementReferenceException handling
    1. Open Chrome browser
    2. Go to https://practice.cydeo.com/add_remove_elements/
    3. Click to “Add Element” button
    4. Verify “Delete” button is displayed after clicking.
    5. Click to “Delete” button.
    6. Verify “Delete” button is NOT displayed after clicking.
USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
 */
