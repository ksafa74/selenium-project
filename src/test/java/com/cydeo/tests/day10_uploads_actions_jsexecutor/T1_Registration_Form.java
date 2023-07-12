package com.cydeo.tests.day10_uploads_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.text.SimpleDateFormat;

public class T1_Registration_Form {

    @Test
    public void registration_form(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        Faker faker = new Faker();

        WebElement firstNameInput = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        firstNameInput.sendKeys(faker.name().firstName());

        WebElement lastNameInput = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        lastNameInput.sendKeys(faker.name().lastName());

        WebElement userNameInput = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        userNameInput.sendKeys(faker.bothify("?????????###"));

        WebElement emailInput = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        emailInput.sendKeys(faker.internet().emailAddress());

        WebElement passwordInput = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        passwordInput.sendKeys(faker.internet().password());

        WebElement phoneInput = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        phoneInput.sendKeys(faker.numerify("###-###-####"));

        WebElement radioFemale = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));

        radioFemale.click();

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        String dob = sdf.format(faker.date().birthday());

        WebElement birthDateInput = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        birthDateInput.sendKeys(dob);

        BrowserUtils.sleep(2);

        Select selectDepartmentDropdown = new Select(Driver
                .getDriver().findElement(By.xpath("//select[@name='department']")));

        selectDepartmentDropdown.selectByValue("DE");

        Select selectJobTitle = new Select(Driver
                .getDriver().findElement(By.xpath("//select[@name='job_title']")));

        selectJobTitle.selectByVisibleText("Developer");

        WebElement javaBox = Driver.getDriver().findElement(By.xpath("//input[@value='java']"));

        javaBox.click();

        WebElement signUpButton = Driver.getDriver().findElement(By.xpath("//button[.='Sign up']"));

        signUpButton.click();

        WebElement actualSuccessMessage = Driver.getDriver().findElement(By.xpath("//div/p"));


        Assert.assertTrue(actualSuccessMessage.isDisplayed());

        Driver.closeDriver();




    }

}
/*
1. Open browser
2. Go to website: https://practice.cydeo.com/registration_form
3. Enter first name
4. Enter last name
5. Enter username
6. Enter email address
7. Enter password
8. Enter phone number
9. Select a gender from radio buttons
10.Enter date of birth
11.Select Department/Office
12.Select Job Title
13.Select programming language from checkboxes
14.Click to sign up button
15.Verify success message “You’ve successfully completed registration.” is
displayed.
 */