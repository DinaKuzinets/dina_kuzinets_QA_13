package com.telRan.course.tests;

import com.telRan.course.model.BoardData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BoardNewCreateTest extends TestBase {


    @Test
    public void testNewBoard() {
        int before = app.getBoardHelper().getBoardCount();
        app.getBoardHelper().openBoardMenu();
        app.getBoardHelper().selectCreateBoard();
        app.getBoardHelper().enterNewBoardName(new BoardData().withBoardName("123"));
        app.getBoardHelper().clickCreateBoardButton();
        app.getNavigationHelper().goToHomepage();
        int after = app.getBoardHelper().getBoardCount();
        Assert.assertEquals(after, before + 1);


    }

}
