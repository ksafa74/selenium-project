package com.cydeo.tests.day10_uploads_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class T6_JavascriptExecutor_Practice {

    @Test
    public void infiniteScrollTestJSExecutor(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        BrowserUtils.sleep(2);

        for (int i = 0; i < 100; i++) {

            BrowserUtils.sleep(1/2);
            js.executeScript("window.scrollBy(0,750)");

        }
        BrowserUtils.sleep(2);
        for (int i = 0; i < 100; i++) {

            BrowserUtils.sleep(1/2);
            js.executeScript("window.scrollBy(0,-750)");
        }
    }
}
/*
TC #6: Scroll using JavascriptExecutor
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/infinite_scroll
3- Use below JavaScript method and scroll
a. 750 pixels down 10 times.
b. 750 pixels up 10 times
JavaScript method to use : window.scrollBy(0,0)
 */
