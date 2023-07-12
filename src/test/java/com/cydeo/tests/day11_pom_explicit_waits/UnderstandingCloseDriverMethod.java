package com.cydeo.tests.day11_pom_explicit_waits;

import com.cydeo.utilities.Driver;
import org.testng.annotations.Test;

public class UnderstandingCloseDriverMethod {

    @Test
    public void test1(){
        Driver.getDriver().get("https://google.com");

    }
    @Test
    public void test2(){
        Driver.getDriver().get("https://google.com");
    }
    @Test
    public void test3(){
        Driver.getDriver().get("https://google.com");
    }
}
