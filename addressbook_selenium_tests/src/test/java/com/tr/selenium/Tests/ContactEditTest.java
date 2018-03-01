package com.tr.selenium.Tests;

import com.tr.selenium.model.ContactData;
import org.testng.annotations.Test;

public class ContactEditTest extends TestBase {

    @Test
    public void testContactEdit(){
        app.clickContactEditButton();
        app.fillContactEditForm(new ContactData("Jerry", "Freidlin"));
        app.clickUpdateContactButton();
        app.returnToContactHomePage();

    }
}
