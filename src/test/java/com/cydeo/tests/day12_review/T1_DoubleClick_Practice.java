package com.cydeo.tests.day12_review;

import com.cydeo.pages.W3_Page;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class T1_DoubleClick_Practice {

    @Test
    public void t1_double_click_test(){

        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

        Driver.getDriver().switchTo().frame("iframeResult");

        W3_Page w3Page = new W3_Page();
        Actions actions = new Actions(Driver.getDriver());

        actions.doubleClick(w3Page.paragraph).perform();

        assertTrue(w3Page.paragraph.getAttribute("style").contains("red"));
        

    }


}
/*
TC #1: Double Click Test
1. Go to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
2. Switch to iframe.
3. Double-click on the text “Double-click me to change my text color.”
4. Assert: Text’s “style” attribute value contains “red”.

 */
