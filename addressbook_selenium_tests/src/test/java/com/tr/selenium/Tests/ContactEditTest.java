package com.tr.selenium.Tests;

import com.tr.selenium.model.ContactData;
import org.testng.annotations.Test;

public class ContactEditTest extends TestBase {

    @Test
    public void testContactEdit() {
        app.getContactHelper().clickContactEditButton();
        app.getContactHelper().fillContactForm(new ContactData("Dina", "Kuzinets"));
        app.getContactHelper().clickUpdateContactButton();
        app.getNavigationHelper().returnToContactHomePage();

    }
}
