package com.tr.selenium.Tests;

import org.testng.annotations.Test;

public class ContactDelTest extends TestBase {

//    @Test
//    public void testDelContact(){
//        app.clickContactEditButton();
//        app.clickDelButton();
//        app.returnToHomePage();
//    }

    @Test
    public void testDelContact2 (){
        app.checkBoxContact();
        app.clickDelButton();
        app.submitContactDel();
        app.returnToHomePage();
    }
}
