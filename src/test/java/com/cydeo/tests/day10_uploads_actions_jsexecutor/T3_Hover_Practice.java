package com.cydeo.tests.day10_uploads_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_Hover_Practice {

    @Test
    public void hoverTest(){

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        Actions actions = new Actions(Driver.getDriver());

        BrowserUtils.sleep(2);
        actions.moveToElement(Driver.getDriver().findElement(By.xpath("(//img)[1]"))).perform();
        WebElement user1Text = Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        Assert.assertTrue(user1Text.isDisplayed());

        BrowserUtils.sleep(2);
        actions.moveToElement(Driver.getDriver().findElement(By.xpath("(//img)[2]"))).perform();
        WebElement user2Text = Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));
        Assert.assertTrue(user2Text.isDisplayed());

        BrowserUtils.sleep(2);
        actions.moveToElement(Driver.getDriver().findElement(By.xpath("(//img)[3]"))).perform();
        WebElement user3Text = Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));
        Assert.assertTrue(user3Text.isDisplayed());

        Driver.closeDriver();












    }


}
/*
1. Go to https://practice.cydeo.com/hovers
2. Hover over to first image
3. Assert:
a. “name: user1” is displayed
4. Hover over to second image
5. Assert:
a. “name: user2” is displayed
6. Hover over to third image
7. Confirm:
a. “name: user3” is displayed
 */