package com.cydeo.tests.day08_properties_config_reader;

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

import java.time.Duration;

public class UseConfigurationReader {

    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(ConfigurationReader.getProperty("googleUrl"));
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void googleSearchTest(){
        WebElement searchBox = driver.findElement(By.xpath("//textarea[@name='q']"));
        BrowserUtils.sleep(2);
        searchBox.sendKeys(ConfigurationReader.getProperty("searchValue")+Keys.ENTER);
        BrowserUtils.sleep(2);


        BrowserUtils.verifyTitle(driver,""+ConfigurationReader.getProperty("searchValue")+" - Google Search");
    }
}
