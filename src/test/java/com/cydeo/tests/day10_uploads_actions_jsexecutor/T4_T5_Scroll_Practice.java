package com.cydeo.tests.day10_uploads_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T4_T5_Scroll_Practice {
    @Test
    public void scrollTest(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        WebElement cydeoLink = Driver.getDriver().findElement(By.xpath("//a[.='CYDEO']"));

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(cydeoLink).perform();

        BrowserUtils.sleep(2);

        WebElement homeLink = Driver.getDriver().findElement(By.xpath("//a[.='Home']"));
        actions.moveToElement(homeLink).perform();

        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
    }
}
/*
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/
3- Scroll down to “Powered by CYDEO”
4- Scroll using Actions class “moveTo(element)” method

1- Continue from where the Task 4 is left in the same test.
2- Scroll back up to “Home” link using PageUP button
 */