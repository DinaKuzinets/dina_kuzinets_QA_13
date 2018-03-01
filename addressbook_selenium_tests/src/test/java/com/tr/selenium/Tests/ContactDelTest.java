package com.tr.selenium.Tests;

import org.testng.annotations.Test;

public class ContactDelTest extends TestBase {

    @Test
    public void testDelContact(){
        app.clickContactEditButton();
        app.Contact();
        app.returnToContactHomePage();
    }

    @Test
    public void testDelContact2 (){
        app.checkBoxContact();
        app.Contact();
        app.submitContactDel();
        app.returnToContactHomePage();
    }
}
