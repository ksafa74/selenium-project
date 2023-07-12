package com.cydeo.utilities;

/*
This class will be storing only the utility methods that can be used across the project.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Set;

public class BrowserUtils{
    /*
    This method will accept int (in seconds) and execute Thread.sleep method for given duration
    Arg: int seconds
     */
    public static void sleep(int seconds){

        seconds = seconds*1000;

        try{
                Thread.sleep(seconds);
        }catch (InterruptedException e){

        }

    }
    public static void switchWindowAndVerify(WebDriver driver,String expectedURL,String expectedTitle){

        Set<String> allHandles = driver.getWindowHandles();
        for (String each : allHandles) {
            driver.switchTo().window(each);
            System.out.println("Current URL: " + driver.getCurrentUrl());

            if(driver.getCurrentUrl().contains(expectedURL)){
                break;
            }

        }
        String actualTitle = driver.getTitle();


        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
    public static void verifyTitle(WebDriver driver, String expectedTitle){

        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);



    }
    public static void verifyTitleContains(WebDriver driver, String expectedTitle){

        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));



    }

    public static void waitForInvisibilityOfGivenElement(WebElement target){

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(target));
    }
    public static void waitForTitleToContain(String title){

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains(title));
    }


    }



