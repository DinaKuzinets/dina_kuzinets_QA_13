package com.tr.selenium.Tests;

import com.tr.selenium.application.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {

    @Test
    public void testContactCreation() {
        app.goToAddNewPage();
        app.fillContactForm(new ContactData("Jerry", "Freidlin"));
        app.cliclEnterButton();
        app.returnToHomePage();



    }
}
