package com.cydeo.tests.review.week3;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertPractice extends TestBase {

    @Test
    public void promptAlertTest(){

        driver.get("https://practice.cydeo.com/javascript_alerts");

        driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();

        Alert alert = driver.switchTo().alert();

        System.out.println("alert.getText() = " + alert.getText());

        alert.sendKeys("hello");
        alert.accept();

        String actual = driver.findElement(By.xpath("//p[@id='result']")).getText();
        String expected = "You entered: hello";

        Assert.assertTrue(actual.equals(expected));

        System.out.println("Finished");


    }



}
