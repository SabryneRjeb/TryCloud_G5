package com.trycloud.tests.UserStory01;

import com.github.javafaker.Faker;
import com.trycloud.tests.base.TestBase;
import com.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC002 {
    WebDriver driver;

    @Test
    public void negativeTestCase() throws InterruptedException {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        1. Story: As a user, I should be able to login.
//                Test case #1 - verify user login successfully
//        1. Navigate to login page http://qa.trycloud.net/index.php/login?clear=1
        driver.get("https://trycloud.net/");
        WebElement loginLink = driver.findElement(By.xpath("(//a[.='Login'])[1]"));
        Thread.sleep(2000);
        loginLink.click();
        Faker faker= new Faker();
//        2. Enter valid username
        WebElement usernameInputBox = driver.findElement(By.xpath("//input[@name='user']"));
        Thread.sleep(1000);
        usernameInputBox.sendKeys("User5");
//        3. Enter valid password
        WebElement passwordInputBox = driver.findElement(By.xpath("//input[@name='password']"));
        Thread.sleep(1000);
        passwordInputBox.sendKeys(faker.internet().password());
//        4. Click login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='submit']"));
        loginButton.click();
        Thread.sleep(2000);

        WebElement wrong=driver.findElement(By.xpath("//p[@class='warning wrongPasswordMsg']"));
        String currentUrl=driver.getCurrentUrl();
        String actualTitle= driver.getTitle();

        String expectedUrl= "https://app.trycloud.net/index.php/login?user=User5";
        String expectedTitle= "Trycloud";





        Assert.assertTrue(expectedTitle.equals(actualTitle), "Title verification failed");
        Assert.assertEquals(currentUrl,expectedUrl,"URL verification failed");
        Assert.assertTrue(wrong.isDisplayed()," Massage did not display ");





    }

}
