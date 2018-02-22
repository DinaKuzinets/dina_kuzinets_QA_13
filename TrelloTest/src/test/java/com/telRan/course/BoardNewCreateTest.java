package com.telRan.course;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BoardNewCreateTest extends TestBase{

    //private String boardName = "TestBoard";


        @Test
    public void NewBoard() {
            openMenu();
            selectCreateBoard();
            enterNewBoardName("TestBoard");
            returnToHomepage();
            clickSpareSpace();
          //  wd.findElement(By.cssSelector("a.board-menu-header-close-button.icon-lg.icon-close.js-hide-sidebar")).click();
        }

}
