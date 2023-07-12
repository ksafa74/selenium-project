package com.cydeo.tests.day07_webtables_utilities_javafaker;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T4_CRM_Login_Task {

    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://login1.nextbasecrm.com/");

    }
    @Test
    public void test1_crm_login() throws InterruptedException {
        WebElement loginInputBox = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        loginInputBox.sendKeys("helpdesk1@cydeo.com");
        WebElement passwordInputBox = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        passwordInputBox.sendKeys("UserUser");
        WebElement loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        Thread.sleep(2000);
        loginButton.click();
        Thread.sleep(2000);

       // BrowserUtils.verifyTitleContains(driver,"Portal");

    }

}
/*
TC #4: Login scenario
    1. Create new test and make set ups
    2. Go to: https://login1.nextbasecrm.com/
    3. Enter valid username
    4. Enter valid password
    5. Click to `Log In` button
    6. Verify title is as expected:
Expected: Portal
 */
