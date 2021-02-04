package com.trycloud.tests.Hoshang;

import org.testng.annotations.Test;

public class Singleton {

    private Singleton() {}

    private static String word;

    public static String getWord() {

        if (word == null) {
            System.out.println("First time call, Word object is null and assigning value to it now");
            word = "value";
        } else {
            System.out.println("Word already has a value");
        }
        return word;
    }

}