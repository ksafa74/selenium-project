package com.cydeo.tests.review.week3;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.WebDriverFactory;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hard_vs_Soft_Assertion {

    @BeforeMethod
    public void setup(){
        Driver.getDriver();
        BrowserUtils.sleep(2);
        Driver.getDriver().get("https://practice.cydeo.com/login");
        BrowserUtils.sleep(2);


    }
    @Test
    public void login_test_hard_assertion(){
        WebElement username = Driver.getDriver().findElement(By.name("username"));
        username.sendKeys("tomsmith");

        WebElement password = Driver.getDriver().findElement(By.name("password"));
        password.sendKeys("SuperSecretPassword");

        WebElement loginBtn1 = Driver.getDriver().findElement(By.id("wooden_spoon"));
        loginBtn1.click();

        Assert.assertEquals(Driver.getDriver().getTitle(),"Secure Are","Title verification failed");

        WebElement resultText = Driver.getDriver().findElement(By.xpath("//div[normalize-space(text())='You logged into a secure area!']"));

        String actualResultText = resultText.getText();
        String expectedResultText = "You logged into a secure area!!!";


        System.out.println("resultText.getText() = " + resultText.getText());

        Assert.assertTrue(actualResultText.contains(expectedResultText));


    }
    @Test
    public void login_test_soft_assertion(){
        WebElement username = Driver.getDriver().findElement(By.name("username"));
        username.sendKeys("tomsmith");

        WebElement password = Driver.getDriver().findElement(By.name("password"));
        password.sendKeys("SuperSecretPassword");

        WebElement loginBtn1 = Driver.getDriver().findElement(By.id("wooden_spoon"));
        loginBtn1.click();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(Driver.getDriver().getTitle(),"Secure Are","Title verification failed");

        WebElement resultText = Driver.getDriver().findElement(By.xpath("//div[normalize-space(text())='You logged into a secure area!']"));
        String actualResultText = resultText.getText();
        String expectedResultText = "You logged into a secure area!!!";


        System.out.println("resultText.getText() = " + resultText.getText());

        softAssert.assertTrue(actualResultText.contains(expectedResultText));

        softAssert.assertAll();


    }
    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }
}
