package com.cydeo.tests.day04_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practices {

    public static void main(String[] args) throws InterruptedException {

       WebDriver driver =  WebDriverFactory.getDriver("chrome");
       driver.manage().window().maximize();

       driver.get("https://practice.cydeo.com/forgot_password");

        WebElement homeLink1 = driver.findElement(By.cssSelector("a[class='nav-link']"));
        WebElement homeLink2 = driver.findElement(By.cssSelector("a.nav-link"));
        WebElement homeLink3 = driver.findElement(By.cssSelector("a[href='/']"));

        WebElement forgotPasswordHeader1 = driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        WebElement forgotPasswordHeader3 = driver.findElement(By.cssSelector("div[class='example'] > h2"));
        WebElement forgotPasswordHeader4 = driver.findElement(By.cssSelector("div.example > h2"));

        WebElement emailLabel1 = driver.findElement(By.xpath("//label[@for='email']"));
        WebElement emailLabel2 = driver.findElement(By.xpath("//label[.='E-mail']"));

        WebElement emailInput1 = driver.findElement(By.xpath("//input[contains(@pattern,'[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}$')]"));
        WebElement emailInput2 = driver.findElement(By.xpath("//input[@name='email']"));

        WebElement retrievePasswordButton1 = driver.findElement(By.xpath("//button[@class='radius']"));
        WebElement retrievePasswordButton2 = driver.findElement(By.xpath("//button[@id='form_submit']"));

        WebElement poweredByCydeoText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        System.out.println("homeLink1.isDisplayed() = " + homeLink1.isDisplayed());
        System.out.println("forgotPasswordHeader1 = " + forgotPasswordHeader1.isDisplayed());
        System.out.println("emailLabel1.isDisplayed() = " + emailLabel1.isDisplayed());
        System.out.println("emailInput1.isDisplayed() = " + emailInput1.isDisplayed());
        System.out.println("retrievePasswordButton1.isDisplayed() = " + retrievePasswordButton1.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());


        Thread.sleep(2000);
        driver.close();




    }
}
/*
XPATH and CSS Selector PRACTICES

DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #1: XPATH and cssSelector Practices
    1. Open Chrome browser
    2. Go to https://practice.cydeo.com/forgot_password
    3. Locate all the WebElements on the page using XPATH and/or CSS
    locator only (total of 6)
    a. “Home” link
    b. “Forgot password” header
    c. “E-mail” text
    d. E-mail input box
    e. “Retrieve password” button
    f. “Powered by Cydeo text
    4. Verify all web elements are displayed.
First solve the task with using cssSelector only. Try to create 2 different
cssSelector if possible
Then solve the task using XPATH only. Try to create 2 different
XPATH locator if possible
 */
