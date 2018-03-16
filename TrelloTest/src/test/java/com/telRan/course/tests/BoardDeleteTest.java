package com.telRan.course.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BoardDeleteTest extends TestBase {



    @Test
    public void testDelBoard() {
     //   app.getNavigationHelper().goToHomepage();
        int before = app.getBoardHelper().getBoardCount();
        app.getBoardHelper().findBoard("1313");
        app.getBoardHelper().clickMoreMenuBoardButton();
        app.getBoardHelper().selectCloseBoard();
        app.getBoardHelper().clickConfirmCloseBoardButton();
        app.getNavigationHelper().goToHomepage();
        int after = app.getBoardHelper().getBoardCount();
        Assert.assertEquals(after, before-1);
        app.getBoardHelper().clickBoardSpareSpace();
    }


}