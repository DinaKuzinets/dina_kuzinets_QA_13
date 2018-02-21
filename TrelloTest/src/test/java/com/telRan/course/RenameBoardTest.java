package com.telRan.course;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RenameBoardTest extends TestBase {

    private String boardName = "TestBoard";
    private String newBoardName = "FirstTestBoard";

    @Test
    public void renameBoard() {
        findOpenBoard(boardName);
        clickBoardName();
        renameB(newBoardName);
        clickConfirmRenameButton();
        returnToHomepage();
        clickSpareSpace();

    }

    private void clickConfirmRenameButton() {
        wd.findElement(By.cssSelector("input.primary.wide.js-rename-board")).click();
    }


    public void findOpenBoard(String boardName) {
        wd.findElementByLinkText(boardName).click();
        //wd.findElement(By.cssSelector("div.chrome.chrome-64.windows.body-webkit-scrollbars.body-tabbed-page:nth-child(2) div.member-boards-view div.js-boards-page div.js-react-root div.boards-page-board-section.mod-no-sidebar:nth-child(1) ul.boards-page-board-section-list li.boards-page-board-section-list-item:nth-child(5) a.board-tile span.board-tile-details.is-badged > span.board-tile-details-name")).click();
    }

    private void clickBoardName() {
        wd.findElement(By.cssSelector("span.board-header-btn-text")).click();
    }

    public void renameB(String newBoardName) {
        wd.findElement(By.cssSelector("input.js-board-name.js-autofocus")).click();
        wd.findElement(By.cssSelector("input.js-board-name.js-autofocus")).clear();
        wd.findElement(By.cssSelector("input.js-board-name.js-autofocus")).sendKeys(newBoardName);
    }


    private void returnToHomepage() {
        wd.findElement(By.cssSelector("span.header-btn-icon.icon-lg.icon-board-back-to-home.light")).click();
    }

    private void clickSpareSpace() {
        wd.findElement(By.cssSelector("div.boards-page-board-section-header")).click();
    }
}
