package com.cydeo.tests.day06_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Dropdowns_T6_T7_T8 {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practice.cydeo.com/dropdown");

    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
    @Test
    public void dropdowns_task6() throws InterruptedException {


        Select selectYear = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select selectMonth = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select selectDay = new Select(driver.findElement(By.xpath("//select[@id='day']")));

        Thread.sleep(2000);
        selectYear.selectByVisibleText("1933");

        Thread.sleep(2000);
        selectMonth.selectByValue("11");

        Thread.sleep(2000);
        selectDay.selectByIndex(0);

        String expectedYear = "1933";
        String expectedMonth = "December";
        String expectedDay = "1";

        String actualYear = selectYear.getFirstSelectedOption().getText();
        String actualMonth = selectMonth.getFirstSelectedOption().getText();
        String actualDay = selectDay.getFirstSelectedOption().getText();

        Assert.assertEquals(expectedYear, actualYear);
        Assert.assertEquals(actualMonth,expectedMonth);
        Assert.assertEquals(actualDay,expectedDay);

    }
    @Test
    public void dropdowns_task7() throws InterruptedException {

        Select selectState = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        Thread.sleep(2000);
        selectState.selectByVisibleText("Illinois");

        Thread.sleep(2000);
        selectState.selectByValue("VA");

        Thread.sleep(2000);
        selectState.selectByIndex(5);

        String expectedOptionText = "California";
        String actualOptionText = selectState.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOptionText,expectedOptionText);



    }
    @Test
    public void dropdowns_task8() throws InterruptedException{

        WebElement linkDropDown = driver.findElement(By.linkText("Dropdown link"));
        Thread.sleep(1000);
        linkDropDown.click();
        Thread.sleep(1000);

        WebElement faceBookLink = driver.findElement(By.linkText("Facebook"));

        Thread.sleep(1000);
        faceBookLink.click();

        String expectedTitle = "Facebook - log in or sign up";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle,"Titles are not equal!");
    }

}
