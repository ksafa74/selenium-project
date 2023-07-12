package com.cydeo.tests.day09_review_properties_javafaker_driverUtil;

public class Singleton {

    private Singleton(){}

    private static String word;

    public static String getWord(){
        if(word==null){
            System.out.println("First time call, word object null");
            System.out.println("Assigning value now");
            word="something";
        }else{
            System.out.println("Word has a value already");
        }
        return word;
    }

}
