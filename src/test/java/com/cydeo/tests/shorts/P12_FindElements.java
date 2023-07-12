package com.cydeo.tests.shorts;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P12_FindElements {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        System.out.println(allLinks.size());

        for (WebElement each : allLinks) {

            System.out.println(each.getText()+" : "+each.getAttribute("href"));
        }

        driver.close();
    }
}
