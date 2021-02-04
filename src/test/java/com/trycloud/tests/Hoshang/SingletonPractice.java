package com.trycloud.tests.Hoshang;

import org.testng.annotations.Test;

public class SingletonPractice {

    @Test
    public void singletonPracticeTest() {

        String str = Singleton.getWord();
        System.out.println(str);

        String str1 = Singleton.getWord();
        System.out.println(str1);

        String str2 = Singleton.getWord();
        System.out.println(str2);
    }

    @Test
    public void singletonPracticeTest2() {
        String str4 = Singleton.getWord();
        System.out.println(str4);
    }
}
