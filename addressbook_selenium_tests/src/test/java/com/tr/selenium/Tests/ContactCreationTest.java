package com.tr.selenium.Tests;

import com.tr.selenium.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {

    @Test
    public void testContactCreation() {
        app.goToAddNewContactePage();
        app.fillContactForm(new ContactData("Jerry", "Freidlin"));
        app.cliclEnterContactButton();
        app.returnToContactHomePage();



    }
}
