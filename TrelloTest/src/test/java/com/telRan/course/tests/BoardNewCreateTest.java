package com.telRan.course.tests;

import com.telRan.course.model.BoardData;
import org.testng.annotations.Test;

public class BoardNewCreateTest extends TestBase{




        @Test
    public void testNewBoard() {
            app.getBoardHelper().openBoardMenu();
            app.getBoardHelper().selectCreateBoard();
            app.getBoardHelper().enterNewBoardName(new BoardData("123"));
            app.getBoardHelper().clickCreateBoardButton();
            app.getNavigationHelper().returnToHomepage();
            app.getBoardHelper().clickSpareSpace();
          //  wd.findElement(By.cssSelector("a.board-menu-header-close-button.icon-lg.icon-close.js-hide-sidebar")).click();
        }

}
