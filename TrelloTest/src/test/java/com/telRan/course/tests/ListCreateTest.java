package com.telRan.course.tests;

import com.telRan.course.model.ListData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ListCreateTest extends TestBase {


    @Test
    public void testListCreate() {
      //  app.getNavigationHelper().goToHomepage();
        app.getBoardHelper().findBoard("ForListTests");
        int before = app.getListHelper().getListCount();
        app.getListHelper().clickAddList();
        app.getListHelper().enterNewListName(new ListData("FirstList"));
        app.getListHelper().clickSaveListButton();
        int after = app.getListHelper().getListCount();
        Assert.assertEquals(after, before+1);
        app.getNavigationHelper().goToHomepage();
        app.getBoardHelper().clickBoardSpareSpace();


    }


}
