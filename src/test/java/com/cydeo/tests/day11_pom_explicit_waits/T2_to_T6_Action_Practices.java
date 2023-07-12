package com.cydeo.tests.day11_pom_explicit_waits;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import static org.testng.Assert.*;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T2_to_T6_Action_Practices {

    @BeforeMethod
    public void setup(){
        Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");

    }
    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }
    @Test
    public void test2_default_value_verification(){

        WebElement bigCircleDefaultText = Driver.getDriver().findElement(By.xpath("//div[.='Drag the small circle here.']"));

        String actual = bigCircleDefaultText.getText();
        String expected = "Drag the small circle here.";
        assertTrue(actual.equals(expected));

    }
    @Test
    public void test3_drop_into_the_big_circle(){
        WebElement bigCircleDefaultText = Driver.getDriver().findElement(By.xpath("//div[.='Drag the small circle here.']"));
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));

        Actions actions = new Actions(Driver.getDriver());
        //actions.dragAndDrop(smallCircle,bigCircleDefaultText).perform();

        actions.clickAndHold(smallCircle).pause(1000).moveToElement(bigCircleDefaultText).pause(1000).release().perform();


        String actual = Driver.getDriver().findElement(By.xpath("//div[.='You did great!']")).getText();
        String expected = "You did great!";

        assertTrue(actual.equals(expected));

    }

    @Test
    public void test4_click_and_hold_small_circle(){
        WebElement bigCircleDefaultText = Driver.getDriver().findElement(By.xpath("//div[.='Drag the small circle here.']"));
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));

        Actions actions = new Actions(Driver.getDriver());
        //actions.dragAndDrop(smallCircle,bigCircleDefaultText).perform();

        actions.clickAndHold(smallCircle).pause(1000).moveToElement(Driver
                .getDriver().findElement(By.linkText("CYDEO"))).perform();


        String actual = Driver.getDriver().findElement(By.id("droptarget")).getText();
        String expected = "Drop here.";

        assertTrue(actual.equals(expected));
    }

    @Test
    public void test5_drop_outside_of_big_circle(){
        WebElement bigCircleDefaultText = Driver.getDriver().findElement(By.xpath("//div[.='Drag the small circle here.']"));
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));

        Actions actions = new Actions(Driver.getDriver());
        //actions.dragAndDrop(smallCircle,bigCircleDefaultText).perform();

        actions.clickAndHold(smallCircle).pause(1000).moveToElement(Driver
                .getDriver().findElement(By.linkText("CYDEO"))).release().perform();


        String actual = Driver.getDriver().findElement(By.id("droptarget")).getText();
        String expected = "Try again!";

        assertTrue(actual.equals(expected));
    }

    @Test
    public void test6_big_circle_hovering_task(){
        WebElement bigCircleDefaultText = Driver.getDriver().findElement(By.xpath("//div[.='Drag the small circle here.']"));
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));

        Actions actions = new Actions(Driver.getDriver());
        //actions.dragAndDrop(smallCircle,bigCircleDefaultText).perform();

        actions.clickAndHold(smallCircle).moveToElement(bigCircleDefaultText).perform();

        String actual = Driver.getDriver().findElement(By.id("droptarget")).getText();
        String expected = "Now drop...";

        assertTrue(actual.equals(expected));
    }





}
/*
TC2 #: Drag and drop default value verification
1. Go to https://practice.cydeo.com/drag_and_drop_circles
2. Verify big circle default text is as below.
3. Assert:
-Text in big circle changed to: “Drag the small circle here.”

TC3 #: Drag and drop into the big circle
1. Go to https://practice.cydeo.com/drag_and_drop_circles
2. Drag and drop the small circle to bigger circle.
3. Assert:
-Text in big circle changed to: “You did great!”

TC4 #: Click and hold
1. Go to https://practice.cydeo.com/drag_and_drop_circles
2. Click and hold the small circle.
3. Assert:
-Text in big circle changed to: “Drop here.”

TC5 #: Drag and drop outside of the big circle
1. Go to https://practice.cydeo.com/drag_and_drop_circles
2. Drag and drop the small circle to bigger circle.
3. Assert:
-Text in big circle changed to: “Try again!”

TC6 #: Drag and hover
1. Go to https://practice.cydeo.com/drag_and_drop_circles
2. Drag the small circle on top of the big circle, hold it, and verify.
3. Assert:
-Text in big circle changed to: “Now drop...”

TC #7: Required field error message test
1- Open a chrome browser
2- Go to: https://library1.cydeo.com
3- Do not enter any information
4- Click to “Sign in” button
5- Verify expected error is displayed:
Expected: This field is required.
 */