package com.cydeo.tests.day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttribute {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/registration_form");

        WebElement header = driver.findElement(By.tagName("h2"));

        String expectedHeader = "Registration form";
        String actualHeader =  header.getText();

        if (actualHeader.equals(expectedHeader)){
            System.out.println("Header text verification Passed!");
        }

        WebElement firstNameBox = driver.findElement(By.className("form-control"));

        String expectedPlaceHolder = "first name";
        String actualPlaceHolder = firstNameBox.getAttribute("placeholder");

        if(actualPlaceHolder.equals(expectedPlaceHolder)){
            System.out.println("Placeholder value verification Passed!");
        }else{
            System.out.println("Placeholder value verification Failed!");

        }

        driver.close();



    }
}
/*
TC #5: getText() and getAttribute() method practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/registration_form
3- Verify header text is as expected:
Expected: Registration form
4- Locate “First name” input box
5- Verify placeholder attribute’s value is as expected:
Expected: first name
 */
