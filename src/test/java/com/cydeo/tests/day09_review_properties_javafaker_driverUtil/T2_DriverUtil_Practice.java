package com.cydeo.tests.day09_review_properties_javafaker_driverUtil;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T2_DriverUtil_Practice {
   /* WebDriver driver;

   @BeforeMethod

    public void setup() {
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }*/

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }

    @Test
    public void bing_search_test(){

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        WebElement searchBox = Driver.getDriver().findElement(By.xpath("//textarea[@id='sb_form_q']"));

        BrowserUtils.sleep(2);
        searchBox.sendKeys(ConfigurationReader.getProperty("searchValue")+ Keys.ENTER);
        BrowserUtils.verifyTitle(Driver.getDriver(),ConfigurationReader.getProperty("searchValue")+" - Search");

    }
    @Test
    public void bing_search_test2(){

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        WebElement searchBox = Driver.getDriver().findElement(By.xpath("//textarea[@id='sb_form_q']"));

        BrowserUtils.sleep(2);
        searchBox.sendKeys(ConfigurationReader.getProperty("searchValue")+ Keys.ENTER);
        BrowserUtils.verifyTitle(Driver.getDriver(),ConfigurationReader.getProperty("searchValue")+" - Search");

    }
}
