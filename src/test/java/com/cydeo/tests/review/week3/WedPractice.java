package com.cydeo.tests.review.week3;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.time.Duration;

public class WedPractice {


    @BeforeMethod
    public void setup() {
        Driver.getDriver();
        Driver.getDriver().get("https://www.flipkart.com");
    }
    @Test
    public void flipKart() {

        WebElement xbutton = Driver.getDriver().findElement(By.xpath("//button[.='✕']"));

        xbutton.click();

        Actions action = new Actions(Driver.getDriver());

        action.moveToElement(Driver.getDriver().findElement(By.xpath("//div[.='Electronics']"))).perform();
        WebElement bTbutton = Driver.getDriver().findElement(By.xpath("//a[.='Bluetooth Headphones']"));

        bTbutton.click();
    }

   @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }

}
