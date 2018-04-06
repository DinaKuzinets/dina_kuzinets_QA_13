package com.telRan.course.tests;

import org.testng.annotations.Test;

public class ListDelTest extends TestBase{

    @Test
    public void testDelBoard(){
        app.getBoardHelper().findBoard("ForListTests");
        if(!app.getListHelper().isListExists()){
            app.getListHelper().createList();
        }
        app.getListHelper().findList();
        app.getListHelper().openListMenu();
        app.getListHelper().cliclArchiveThisList();
        app.getNavigationHelper().goToHomepage();

    }
}
