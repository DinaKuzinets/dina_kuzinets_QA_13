package com.telRan.course.tests;

import com.telRan.course.model.ListData;
import org.testng.annotations.Test;

public class ListCreateTest extends TestBase {


    @Test
    public void testListCreate() {
        app.getBoardHelper().findBoard("ForListTests");
        app.getListHelper().clickAddList();
        app.getListHelper().enterNewListName(new ListData("FirstList"));
        app.getListHelper().clickSaveListButton();
        app.getNavigationHelper().returnToHomepage();
        app.getBoardHelper().clickSpareSpace();


    }


}
