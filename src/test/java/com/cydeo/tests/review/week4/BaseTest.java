package com.cydeo.tests.review.week4;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {


    @BeforeMethod
    public void setup() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
        // you can implement taking a screenshot here to take a screenshot after each test
    }


}
