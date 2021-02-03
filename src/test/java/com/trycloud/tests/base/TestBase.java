package com.trycloud.tests.base;
import com.google.common.base.Verify;
import com.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
public abstract class TestBase {
    public WebDriver driver;
    @BeforeMethod
    public void setUpMethod() throws InterruptedException {
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
//        2. Enter valid username
        WebElement usernameInputBox = driver.findElement(By.xpath("//input[@name='user']"));
        Thread.sleep(1000);
        usernameInputBox.sendKeys("User5");
//        3. Enter valid password
        WebElement passwordInputBox = driver.findElement(By.xpath("//input[@name='password']"));
        Thread.sleep(1000);
        passwordInputBox.sendKeys("Userpass123");
//        4. Click login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='submit']"));
        loginButton.click();
        Thread.sleep(2000);
    }

}