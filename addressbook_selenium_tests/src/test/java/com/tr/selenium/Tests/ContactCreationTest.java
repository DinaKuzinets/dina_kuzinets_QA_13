package com.tr.selenium.Tests;

import com.tr.selenium.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class ContactCreationTest extends TestBase {

    @Test
    public void testContactCreation() {
        app.getNavigationHelper().goToContactHomePage();
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().goToAddNewContactePage();
        File photo = new File("addressbook_selenium_tests/src/test/resources/cat.jpg");
        app.getContactHelper().fillContactForm(new ContactData()
                .withFitstName("123")
                .withLastName("123")
                .withAddress("123d")
                .withPhone("123456789")
                .withGroup("test77")
                .withPhoto(photo));
        app.getContactHelper().clickEnterContactButton();
        app.getNavigationHelper().goToContactHomePage();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before + 1);


    }
}
