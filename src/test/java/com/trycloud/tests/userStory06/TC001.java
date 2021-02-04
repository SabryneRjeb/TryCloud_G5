package com.trycloud.tests.userStory06;

import com.trycloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TC001 extends TestBase {




    @Test
    public void talksModule() throws InterruptedException {


       List <WebElement> taskModule=driver.findElements(By.xpath("//*[@id=\"appmenu\"]/li/a"));



       // taskModule.remove(6);
        //System.out.println("taskModule.size() = " + taskModule.size());

        for (WebElement eachElement : taskModule) {

            Thread.sleep(5000);
            System.out.println("eachElement.getAttribute() = " + eachElement.getAttribute("aria-label"));



        }

        //Test fails bc we do not have "note list"


    }
}
