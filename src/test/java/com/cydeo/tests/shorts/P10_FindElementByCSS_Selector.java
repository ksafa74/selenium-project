package com.cydeo.tests.shorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P10_FindElementByCSS_Selector {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/");

        WebElement homeLink = driver.findElement(By.cssSelector("a.nav-link"));

        if(homeLink.getText().equals("Home")){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

        driver.close();
    }
}
