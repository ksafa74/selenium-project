package com.cydeo.tests.day06_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T1_T2_T3_Alert_Practices {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        //TC #1: Information alert practice
        //1. Open browser
        //2. Go to website: http://practice.cydeo.com/javascript_alert

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practice.cydeo.com/javascript_alerts");

    }

    @AfterMethod
    public void tearDownMethod() {

        driver.close();
    }

    @Test
    public void information_alert_test1() throws InterruptedException {

        WebElement jsAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        Thread.sleep(2000);
        jsAlertButton.click();
        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        Assert.assertTrue(resultText.isDisplayed(), "Result text is NOT displayed!");

        String expectedText = "You successfully clicked an alert";
        String actualText = resultText.getText();

        Assert.assertEquals(actualText, expectedText, "Actual text is NOT equal to expected text!");


        //3. Click to “Click for JS Alert” button
        //4. Click to OK button from the alert
        //5. Verify “You successfully clicked an alert” text is displayed.
    }

    @Test
    public void confirmation_alert_test2() {

        // TC #2: Confirmation alert practice
        //3. Click to “Click for JS Confirm” button

        WebElement confirmationAlert = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        confirmationAlert.click();

        //4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();

        //5. Verify “You clicked: Ok” text is displayed.
        WebElement confirmText = driver.findElement(By.xpath("//p[@id='result']"));
       // String expectedConfirmText = "You clicked: Ok";
       // String actualConfirmText = confirmText.getText();

        Assert.assertTrue(confirmText.isDisplayed());



    }
}


