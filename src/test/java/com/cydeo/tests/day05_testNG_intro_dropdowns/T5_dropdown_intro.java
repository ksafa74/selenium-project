package com.cydeo.tests.day05_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class T5_dropdown_intro {

    WebDriver driver;

    @BeforeMethod
    public void setup(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://practice.cydeo.com/dropdown");


    }
    @AfterMethod
    public void tearDown(){

        driver.quit();

    }

    @Test
    public void simpleDropDownTest(){

        WebElement simpleDropDown = driver.findElement(By.xpath("//select[@id='dropdown']"));

        Select select = new Select(simpleDropDown);


        String expectedSelectionValue = "Please select an option";
        String actualSelectionValue = select.getFirstSelectedOption().getText();

        Assert.assertTrue(actualSelectionValue.equals(expectedSelectionValue));
        Assert.assertEquals(actualSelectionValue,expectedSelectionValue);

        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        String expectedDefaultState = "Select a State";
        String actualDefaultState = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualDefaultState,expectedDefaultState);

        //List<WebElement> optionList = stateDropdown.getOptions();


    }





}
/*
TC#5: Verifying “Simple dropdown” and “State selection” dropdown
default values
    1. Open Chrome browser
    2. Go to https://practice.cydeo.com/dropdown
    3. Verify “Simple dropdown” default selected value is correct
    Expected: “Please select an option”
    4. Verify “State selection” default selected value is correct
Expected: “Select a State”
 */