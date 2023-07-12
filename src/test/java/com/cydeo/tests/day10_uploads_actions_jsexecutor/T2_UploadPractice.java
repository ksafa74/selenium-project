package com.cydeo.tests.day10_uploads_actions_jsexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;

public class T2_UploadPractice {

    @Test
    public void uploadingTest(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        String path = "/Users/safamac/Desktop/TestFolder/TestFile.txt";

        WebElement chooseFileButton = Driver.getDriver().findElement(By.xpath("//input[@id='file-upload']"));

        chooseFileButton.sendKeys(path);

        WebElement uploadButton = Driver.getDriver().findElement(By.xpath("//input[@id='file-submit']"));

        uploadButton.click();
        WebElement fUHeader = Driver.getDriver().findElement(By.xpath("//h3"));
        WebElement testFileText = Driver.getDriver().findElement(By.xpath("//h3/following-sibling::div"));

        Assert.assertTrue(fUHeader.isDisplayed() && testFileText.isDisplayed());

    }
}
/*
1. Go to https://practice.cydeo.com/upload
2. Find some small file from your computer, and get the path of it.
3. Upload the file.
4. Assert:
-File uploaded text is displayed on the page
 */
