package com.cydeo.tests.review.week3;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import com.cydeo.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class IframePractice extends TestBase {

    @Test
    public void sendingMessageIframeTest() {

        // 1. Users are already login and on the homepage of CRM app
        driver.get(ConfigurationReader.getProperty("env"));

        CRM_Utilities.login_crm(driver,ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("password"));


        // 2. Users click the MESSAGE tab

        // 3. Users write test message

        // 4. Users click the SEND button

        // 5. Verify the message is displayed on the feed
    }
}
