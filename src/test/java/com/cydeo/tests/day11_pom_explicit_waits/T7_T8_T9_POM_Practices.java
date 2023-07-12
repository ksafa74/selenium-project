package com.cydeo.tests.day11_pom_explicit_waits;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.Driver;
import static org.testng.Assert.*;

import org.openqa.selenium.Keys;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T7_T8_T9_POM_Practices {

    LibraryLoginPage loginPage;

    @BeforeMethod
    public void setup(){
        Driver.getDriver().get("https://library1.cydeo.com");
        loginPage = new LibraryLoginPage();


    }
    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }
    @Test
    public void t7_field_required_error_message_test() {

        loginPage.signInButton.click();
        assertTrue(loginPage.fieldRequiredErrorMessage.isDisplayed());

    }
    @Test
    public void t8_email_format_error_message_test(){

        loginPage.emailInput.sendKeys("username");
        loginPage.signInButton.click();
        assertTrue(loginPage.enterValidEmailErrorMessage.isDisplayed());

    }
    @Test
    public void t9_wrong_email_or_password_error_message(){

        loginPage.emailInput.sendKeys("asdf@gmail.com");
        loginPage.passwordInput.sendKeys("afjkdeio233@");
        loginPage.signInButton.click();
        assertTrue(loginPage.wrongEmailOrPassword.isDisplayed());



    }
}
/*
TC #7: Required field error message test
1- Open a chrome browser
2- Go to: https://library1.cydeo.com
3- Do not enter any information
4- Click to “Sign in” button
5- Verify expected error is displayed:
Expected: This field is required.

TC #8: Invalid email format error message test
1- Open a chrome browser
2- Go to: https://library1.cydeo.com
3- Enter invalid email format
4- Verify expected error is displayed:
Expected: Please enter a valid email address.

TC #9: Library negative login
1- Open a chrome browser
2- Go to: https://library1.cydeo.com
3- Enter incorrect username or incorrect password
4- Verify title expected error is displayed:
Expected: Sorry, Wrong Email or Password
 */
