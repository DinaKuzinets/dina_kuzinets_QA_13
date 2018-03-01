package com.tr.selenium.Tests;

import com.tr.selenium.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {

    @Test
    public void testContactCreation() {
        int before = app.getContactHelper().getContactCount();
        app.getNavigationHelper().goToAddNewContactePage();
        app.getContactHelper().fillContactForm(new ContactData("Jerry", "Freidlin", "Rishon", "1234567890"));
        app.getContactHelper().clickEnterContactButton();
        app.getNavigationHelper().returnToContactHomePage();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before + 1);


    }
}
