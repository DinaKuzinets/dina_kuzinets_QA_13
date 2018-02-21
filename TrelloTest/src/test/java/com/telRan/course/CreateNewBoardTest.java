package com.telRan.course;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateNewBoardTest extends TestBase{

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


    public void openMenu(){
    wd.findElement(By.cssSelector("span.header-btn-icon.icon-lg.icon-add.light")).click();
}

    private void selectCreateBoard() {
        wd.findElement(By.cssSelector("a.js-new-board")).click();
    }
    private void enterNewBoardName(String boardName) {
        wd.findElement(By.cssSelector("input.subtle-input")).sendKeys(boardName);
        wd.findElement(By.cssSelector("button.primary")).click();
    }

    private void returnToHomepage() {
        wd.findElement(By.cssSelector("span.header-btn-icon.icon-lg.icon-board-back-to-home.light")).click();
    }

    private void clickSpareSpace(){
        wd.findElement(By.cssSelector("div.boards-page-board-section-header")).click();
    }
}
