package com.cydeo.tests.day12_review;

import com.cydeo.pages.DynamicControlsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.*;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T2_T3_Explicit_Wait_Practices {

    DynamicControlsPage dynamicControlsPage;

    @BeforeMethod
    public void setup() {
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
        dynamicControlsPage = new DynamicControlsPage();
    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }

    @Test
    public void t2_remove_checkbox_test() {

        dynamicControlsPage.clickButton.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        wait.until(ExpectedConditions.invisibilityOf(dynamicControlsPage.loadingBar));

        try {
            assertFalse(dynamicControlsPage.checkbox.isDisplayed());
        } catch (NoSuchElementException e) {
            System.out.println("Checkbox is not on the page so NoSuchElementException is thrown");
            assertTrue(true);
        }
        assertTrue(dynamicControlsPage.itsGoneMessage.isDisplayed());
    }

    @Test
    public void t3_enable_input_box_test() {
        dynamicControlsPage.enableButton.click();
        BrowserUtils.waitForInvisibilityOfGivenElement(dynamicControlsPage.loadingBar);

        Assert.assertTrue(dynamicControlsPage.inputBox.isEnabled());
        Assert.assertTrue(dynamicControlsPage.itsEnabledMessage.isDisplayed());


    }

}
/*
TC #2: Explicit wait practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/dynamic_controls
3- Click to “Remove” button
4- Wait until “loading bar disappears”
5- Verify:
a. Checkbox is not displayed
b. “It’s gone!” message is displayed.

TC #3: Explicit wait practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/dynamic_controls
3- Click to “Enable” button
4- Wait until “loading bar disappears”
5- Verify:
a. Input box is enabled.
b. “It’s enabled!” message is displayed.
 */
