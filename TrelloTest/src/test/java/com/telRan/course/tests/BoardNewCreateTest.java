package com.telRan.course.tests;

import com.telRan.course.model.BoardData;
import org.testng.annotations.Test;

public class BoardNewCreateTest extends TestBase{




        @Test
    public void testNewBoard() {
            app.openBoardMenu();
            app.selectCreateBoard();
            app.enterNewBoardName(new BoardData("ForListTests"));
            app.returnToHomepage();
            app.clickSpareSpace();
          //  wd.findElement(By.cssSelector("a.board-menu-header-close-button.icon-lg.icon-close.js-hide-sidebar")).click();
        }

}
