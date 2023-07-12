package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class W3_Page {

    public W3_Page(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(id = "demo")
    public WebElement paragraph;



}
