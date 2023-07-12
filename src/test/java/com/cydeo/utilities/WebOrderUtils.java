package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebOrderUtils {

    public static String returnOrderDate(WebDriver driver, String customerName) {

        String locator = "//table[@class='SampleTable']/tbody//td[.='" + customerName + "']/following-sibling::td[3]";

        return driver.findElement(By.xpath(locator)).getText();




    }

    public static void orderVerify(WebDriver driver, String customerName, String expectedOrderDate) {

        String actualOrderDate = WebOrderUtils.returnOrderDate(driver, customerName);

        Assert.assertEquals(actualOrderDate, expectedOrderDate);


    }
}

/*
Method #1 info:
    • Name: returnOrderDate ()
    • Return type: String
    • Arg1: WebDriver driver
    • Arg2: String costumerName
This method should accept a costumerName and return the costumer order date
as a String.
 */
