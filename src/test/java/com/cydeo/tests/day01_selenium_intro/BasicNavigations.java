package com.cydeo.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException{

        WebDriverManager.chromedriver().setup();

       WebDriver driver = new ChromeDriver();
      /*  driver.manage().window().maximize();// maximize is used for both mac and windows


        driver.get("https://www.tesla.com");

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        System.out.println("driver.getTitle() = " + driver.getTitle());
        Thread.sleep(3000);

        driver.navigate().back();

        Thread.sleep(3000);

        driver.navigate().forward();

        Thread.sleep(3000);

        driver.navigate().refresh();

        driver.navigate().to("https://www.google.com");

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        if(driver.getTitle().equals("Google")){
            System.out.println("Title correct: "+driver.getTitle());
        }

        driver.quit();

*/
    }
}
