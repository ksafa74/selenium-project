package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_locators_getText_getAttribute {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));
        String actualRememberMeText = rememberMeLabel.getText();
        String expectedRememberMeText = "Remember me on this computer";

        if(actualRememberMeText.equals(expectedRememberMeText)){
            System.out.println("\"Remember me\" label text Verification PASSED!");
        }else{
        System.out.println("\"Remember me\" label text Verification FAILED!");
        }

        WebElement passwordMessageLink = driver.findElement(By.className("login-link-forgot-pass"));
        String actualPasswordMessage = passwordMessageLink.getText();
        String expectedPasswordMessage = "FORGOT YOUR PASSWORD?";

        if(actualPasswordMessage.equals(expectedPasswordMessage)){
            System.out.println("\"Forgot Password\" link text Verification PASSED!");
        }else{
            System.out.println("\"Forgot Password\" link text Verification FAILED!");
        }

        String expectedHrefAttributeValue = "forgot_password=yes";
        String actualHrefAttributeValue = passwordMessageLink.getAttribute("href");

        if(actualHrefAttributeValue.contains(expectedHrefAttributeValue)){
            System.out.println("\"Forgot Password\" attribute value Verification PASSED!");
        }else{
            System.out.println("\"Forgot Password\" attribute value Verification FAILED!");
        }

        driver.quit();



    }
}
/*
TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
    1- Open a chrome browser
    2- Go to: https://login1.nextbasecrm.com/
    3- Verify “remember me” label text is as expected:
    Expected: Remember me on this computer
    4- Verify “forgot password” link text is as expected:
    Expected: Forgot your password?
    5- Verify “forgot password” href attribute’s value contains expected:
    Expected: forgot_password=yes

PS: Inspect and decide which locator you should be using to locate web
elements.
 */
