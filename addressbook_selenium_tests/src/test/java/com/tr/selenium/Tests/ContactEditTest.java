package com.tr.selenium.Tests;

import com.tr.selenium.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactEditTest extends TestBase {

    @Test
    public void testContactEdit() {
        app.getNavigationHelper().goToContactHomePage();
        if(!app.getContactHelper().isContactExists()){
            app.getContactHelper().createContact();
        }
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().clickContactEditButton();
        app.getContactHelper().fillContactForm(new ContactData()
                .withFitstName("Dina")
                .withLastName("Kuzinets")
                .withAddress(null)
                .withPhone("987654321"));
        app.getContactHelper().clickUpdateContactButton();
        app.getNavigationHelper().goToContactHomePage();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before);

    }
}
