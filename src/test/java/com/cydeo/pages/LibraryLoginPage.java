package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    // initialize the object of the class and the driver instance inside the constructor

    public  LibraryLoginPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }
    // Use @FindBy annotation instead of findElement method
    @FindBy(id = "inputEmail")
    public WebElement emailInput;


    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInButton;

    @FindBy(xpath = "//div[@id='inputEmail-error']")
    public WebElement fieldRequiredErrorMessage;

    @FindBy(xpath = "//div[.='Please enter a valid email address.']/div" )
    public WebElement enterValidEmailErrorMessage;

    @FindBy(id = "inputPassword")
    public WebElement passwordInput;

    @FindBy(xpath = "//div[.='Sorry, Wrong Email or Password']")
    public WebElement wrongEmailOrPassword;



}
