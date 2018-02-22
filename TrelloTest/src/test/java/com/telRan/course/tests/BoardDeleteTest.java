package com.telRan.course.tests;

import org.testng.annotations.Test;

public class BoardDeleteTest extends TestBase {



    @Test
    public void testDelBoard() {
        app.findBoard("TestBoard");
        app.openBoardMoreMenu();
        app.selectCloseBoard();
        app.clickConfirmCloseBoardButton();
        app.returnToHomepage();
        app.clickSpareSpace();
    }


}