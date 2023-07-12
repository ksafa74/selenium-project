package com.cydeo.tests.day11_pom_explicit_waits;

import com.cydeo.pages.DynamicLoad7Page;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

import java.time.Duration;

public class T10_ExplicitWaitPractice {

    @Test
    public void test10_wait_until_title_changes(){
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleIs("Dynamic title"));

        DynamicLoad7Page dynamicLoad7Page = new DynamicLoad7Page();
        assertTrue(dynamicLoad7Page.doneMessage.isDisplayed());
        assertTrue(dynamicLoad7Page.spongeBobImage.isDisplayed());







    }
}
/*
TC#10 : Dynamically Loaded Page Elements 7
1. Go to https://practice.cydeo.com/dynamic_loading/7
2. Wait until title is “Dynamic title”
3. Assert: Message “Done” is displayed.
4. Assert: Image is displayed.
 */