package com.cydeo.tests.day09_review_properties_javafaker_driverUtil;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.security.Key;
import java.time.Duration;

public class T1_Bing_Search {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(ConfigurationReader.getProperty("url"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void bing_search_test(){
        WebElement searchBox = driver.findElement(By.xpath("//textarea[@id='sb_form_q']"));

        BrowserUtils.sleep(2);
        searchBox.sendKeys(ConfigurationReader.getProperty("searchValue")+ Keys.ENTER);
        BrowserUtils.verifyTitle(driver,ConfigurationReader.getProperty("searchValue")+" - Search");

    }


}
/*
TC #1: Bing search
    1- Open a Chrome browser
    2- Go to: https://bing.com
    3- Write “apple” in search box
    4- Verify title:
Expected: apple - Search
 */
