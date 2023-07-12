package com.cydeo.tests.review.week4;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class MLS {

    public static void main(String[] args) {


        Driver.getDriver().get("https://publicindex.sccourts.org/horry/courtrosters/RosterDetails.aspx?CourtAgency=26003&RosterID=383&RosterCode=MO");

        List<String> taxMapNumbers = new ArrayList<>();

        for (int i = 1; i <= 17; i++) {

            int index = i;

            String locator = "//tr[@valign='top'][" + index + "]/td[10]";

            String taxMap = Driver.getDriver().findElement(By.xpath(locator)).getText();

            taxMapNumbers.add(taxMap);

        }
        List<String> numbers = new ArrayList<>();


        for (String taxMapNumber : taxMapNumbers) {
            String number = taxMapNumber.replaceAll("[^0-9]", "");
            numbers.add(number);

        }
        for (String number : numbers) {

            System.out.println(number);

        }
    }
}

