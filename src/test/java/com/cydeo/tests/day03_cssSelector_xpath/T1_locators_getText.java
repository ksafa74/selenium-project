package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_locators_getText {
    public static void main(String[] args) {

        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        WebElement login = driver.findElement(By.className("login-inp"));
        login.sendKeys("incorrect");

        WebElement password = driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("incorrect");

        WebElement button = driver.findElement(By.className("login-btn"));
        button.click();

        String expectedErrorText = "Incorrect login or password";
        String actualErrorText = driver.findElement(By.className("errortext")).getText();

        String result = actualErrorText.equals(expectedErrorText) ? "pass" : "fail";

        System.out.println(result);

    }
}
/*
TC #1: NextBaseCRM, locators and getText() practice

    1- Open a Chrome browser
    2- Go to: https://login1.nextbasecrm.com/
    3- Enter incorrect username: “incorrect”
    4- Enter incorrect password: “incorrect”
    5- Click to the login button.
    6- Verify error message text is as expected:
    Expected: Incorrect login or password

PS: Inspect and decide which locator you should be using to locate web
elements.
 */