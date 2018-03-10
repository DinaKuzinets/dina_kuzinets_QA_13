package com.tr.selenium.Tests;

import com.tr.selenium.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {

    @Test
    public void testContactCreation() {
        app.getNavigationHelper().goToContactHomePage();
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().goToAddNewContactePage();
        app.getContactHelper().fillContactForm(new ContactData()
                .withFitstName("Dina")
                .withLastName("Kuzinets")
                .withAddress("Rishon")
                .withPhone("123456789"));
        app.getContactHelper().clickEnterContactButton();
        app.getNavigationHelper().goToContactHomePage();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before + 1);


    }
}
