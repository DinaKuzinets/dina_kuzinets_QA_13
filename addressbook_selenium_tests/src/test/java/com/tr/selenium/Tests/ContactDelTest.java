package com.tr.selenium.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactDelTest extends TestBase {


    @Test
    public void testDelContact(){
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().checkBoxContact();
        app.getContactHelper().clickContactDetButton();
        app.getContactHelper().submitContactDel();
        app.getNavigationHelper().returnToContactHomePage();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before-1);
    }
}
