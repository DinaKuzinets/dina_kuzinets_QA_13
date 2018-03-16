package com.telRan.course.tests;

import org.testng.annotations.Test;

public class BoardDeleteTest extends TestBase {



    @Test
    public void testDelBoard() {
        app.getBoardHelper().findBoard("1313");
        app.getBoardHelper().clickMoreMenuBoardButton();
        app.getBoardHelper().selectCloseBoard();
        app.getBoardHelper().clickConfirmCloseBoardButton();
        app.getNavigationHelper().returnToHomepage();
        app.getBoardHelper().clickSpareSpace();
    }


}