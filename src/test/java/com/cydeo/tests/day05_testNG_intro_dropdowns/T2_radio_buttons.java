package com.cydeo.tests.day05_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T2_radio_buttons {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://practice.cydeo.com/radio_buttons");

        WebElement hockeyButton = driver.findElement(By.xpath("//input[@id='hockey']"));

        hockeyButton.click();

        System.out.println("hockeyButton.isDisplayed(), true : " + hockeyButton.isDisplayed());

        driver.quit();

    }
}
/*
TC #2: Radiobutton handling
    1. Open Chrome browser
    2. Go to https://practice.cydeo.com/radio_buttons
    3. Click to “Hockey” radio button
    4. Verify “Hockey” radio button is selected after clicking.
USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
 */
