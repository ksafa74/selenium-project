package com.cydeo.tests.shorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P00_SeleniumTest {

    public static void main(String[] args) {

         //1- setting up the web driver manager
        WebDriverManager.chromedriver().setup();

        //2- create the instance of Chrome browser driver
        WebDriver driver = new ChromeDriver();

        //3- test if driver and browser are working as expected
        driver.get("https://www.google.com");
    }
}
