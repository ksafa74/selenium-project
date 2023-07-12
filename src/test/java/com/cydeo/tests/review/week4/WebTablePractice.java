package com.cydeo.tests.review.week4;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v111.input.model.DragData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WebTablePractice extends BaseTest{

    @Test
    public void webTable_test(){

        WebElement table1 = Driver.getDriver().findElement(By.xpath("//table[@id='table1']"));

        System.out.println("table1.getText() = " + table1.getText());

        Assert.assertTrue(table1.getText().contains("tconway@earthlink.net"),"tconway@earthlink.net is not in table1");

        WebElement columnNames = Driver.getDriver().findElement(By.xpath("//table[@id='table1']/thead"));

        System.out.println("columnNames.getText() = " + columnNames.getText());

        List<WebElement> columnNamesList = Driver.getDriver().findElements(By.xpath("//table[@id='table1']/thead/tr/th"));

        for (WebElement each : columnNamesList) {


        }


    }
}
