package com.cydeo.tests.day06_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T4_iframes {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        //TC #1: Information alert practice
        //1. Open browser
        //2. Go to website: http://practice.cydeo.com/javascript_alert

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practice.cydeo.com/iframe");

    }

    @AfterMethod
    public void tearDownMethod() {

        driver.close();
    }


    @Test
    public void iframeTest(){
        //driver.switchTo().frame("mce_0_ifr");

        //driver.switchTo().frame(0);

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));


       WebElement paragraphText =  driver.findElement(By.xpath("//p[.='Your content goes here.']"));

        Assert.assertTrue(paragraphText.isDisplayed());

        driver.switchTo().parentFrame();

        WebElement h3 = driver.findElement(By.tagName("h3"));
        Assert.assertTrue(h3.isDisplayed());



    }


}
/*
TC #4: Iframe practice
    1. Create a new class called: T4_Iframes
    2. Create new test and make set ups
    3. Go to: https://practice.cydeo.com/iframe
    4. Assert: “Your content goes here.” Text is displayed.
    5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
 */
