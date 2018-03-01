package com.tr.selenium.Tests;

import com.tr.selenium.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {

    @Test
    public void testContactCreation() {
        app.getNavigationHelper().goToAddNewContactePage();
        app.getContactHelper().fillContactForm(new ContactData("Jerry", "Freidlin"));
        app.getContactHelper().clickEnterContactButton();
        app.getNavigationHelper().returnToContactHomePage();


    }
}
