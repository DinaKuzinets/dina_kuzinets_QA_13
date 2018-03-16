package com.telRan.course.tests;

import org.testng.annotations.Test;

public class ListDelTest extends TestBase{

    @Test
    public void testDelBoard(){
        app.getBoardHelper().findBoard("123");
        app.getListHelper().findList();
        app.getListHelper().openListMenu();
        app.getListHelper().cliclArchiveThisList();
        app.getNavigationHelper().goToHomepage();

    }
}
