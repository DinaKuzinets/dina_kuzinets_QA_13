package com.tr.selenium.Tests;

import org.testng.annotations.Test;

public class ContactDelTest extends TestBase {


    @Test
    public void testDelContact(){
        app.getContactHelper().checkBoxContact();
        app.getContactHelper().clickContactDetButton();
        app.getContactHelper().submitContactDel();
        app.getNavigationHelper().returnToContactHomePage();
    }
}
