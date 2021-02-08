package com.trycloud.tests.UserStory05;

import com.github.javafaker.Faker;
import com.trycloud.tests.base.TestBase;
import com.trycloud.tests.base.TestBase2;
import com.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase02 extends TestBase2 {

    //Test case #2 - verify users can add contacts
//1. Login as a user
//2. Click contacts module
//3. Click “New Contact” button
//4. Fill out the contact info like : Title, Phone, email, address , etc
//5. Verify the contact name is added to the contact list

    @Test

    public void usersCanADDContacts(){

        //2. Click contacts module
        WebElement contactMenu = driver.findElement(By.xpath("(//a[@aria-label='Contacts'])[1]"));
        BrowserUtils.sleep(2);
        contactMenu.click();
        //3. Click “New Contact” button

        WebElement createContactButton = driver.findElement(By.xpath("//div[@class='app-navigation-new']"));
        BrowserUtils.sleep(2);
        createContactButton.click();

        WebElement newContact = driver.findElement(By.xpath("//input[@placeholder='Name']"));
        // newContact.click();
        WebElement companyName = driver.findElement(By.xpath("//input[@id='contact-org']"));

        WebElement title = driver.findElement(By.xpath("//input[@id='contact-title']"));

        WebElement phoneNumber = driver.findElement(By.xpath("//input[@inputmode='tel']"));
        WebElement email = driver.findElement(By.xpath("//input[@inputmode='email']"));

        WebElement Address = driver.findElement(By.xpath("(//div[@class='property__row'][3])/input[@type='text']"));

        WebElement postalCode = driver.findElement(By.xpath("(//div[@class='property__row'][5]/input[@type='text'])"));

        WebElement city = driver.findElement(By.xpath("(//div[@class='property__row'][6])/input[@type='text']"));

        WebElement state = driver.findElement(By.xpath("(//div[@class='property__row'][7])/input[@type='text']"));

        WebElement country = driver.findElement(By.xpath("(//div[@class='property__row'][8])/input[@type='text']"));


        Faker faker = new Faker();
        newContact.click();
        newContact.sendKeys(faker.name().fullName());
        BrowserUtils.sleep(1);
        companyName.sendKeys("Cybertek");
        BrowserUtils.sleep(1);
        title.sendKeys(faker.name().title());
        BrowserUtils.sleep(1);
        phoneNumber.sendKeys(faker.phoneNumber().cellPhone());
        BrowserUtils.sleep(1);
        email.sendKeys(faker.internet().emailAddress());
        BrowserUtils.sleep(1);
        Address.sendKeys(faker.address().streetAddress());
        BrowserUtils.sleep(1);
        postalCode.sendKeys(faker.address().zipCode());
        BrowserUtils.sleep(1);
        city.sendKeys(faker.address().city());
        BrowserUtils.sleep(1);
        state.sendKeys(faker.address().state());
        BrowserUtils.sleep(1);
        country.sendKeys(faker.address().country());




        //5. Verify the contact name is added to the contact list

        WebElement contactList = driver.findElement(By.xpath("//div[@class='vue-recycle-scroller__item-wrapper']"));
        String contactsAdded = contactList.getText();
        Assert.assertFalse(contactsAdded.isEmpty(),"Verification failed");



    }

}
