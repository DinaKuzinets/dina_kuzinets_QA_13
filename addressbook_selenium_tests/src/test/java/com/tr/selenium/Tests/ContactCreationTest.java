package com.tr.selenium.Tests;

import com.tr.selenium.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {

    @Test
    public void testContactCreation() {
        int before = app.getContactHelper().getContactCount();
        app.getNavigationHelper().goToAddNewContactePage();
        app.getContactHelper().fillContactForm(new ContactData()
                .withFitstName("Vova")
                .withLastName("Freidlin")
                .withAddress("Rishon")
                .withPhone("123456789"));
        app.getContactHelper().clickEnterContactButton();
        app.getNavigationHelper().returnToContactHomePage();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before + 1);


    }
}
