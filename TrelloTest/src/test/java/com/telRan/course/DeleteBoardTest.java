package com.telRan.course;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DeleteBoardTest extends TestBase {



    public String boardName = "TestBoard";

    @Test
    public void DelBoard() {
        findBoard(boardName);
        openMenuMore();
        selectCloseBoard();
        clickConfirmCloseButton();
        returnToHomepage();
        clickSpareSpace();
    }


    public void findBoard(String boardName) {
        wd.findElementByLinkText(boardName).click();
        //   wd.findElement(By.cssSelector("div.chrome.chrome-64.windows.body-webkit-scrollbars.body-tabbed-page:nth-child(2) div.member-boards-view div.js-boards-page div.js-react-root div.boards-page-board-section.mod-no-sidebar:nth-child(1) ul.boards-page-board-section-list li.boards-page-board-section-list-item:nth-child(5) a.board-tile span.board-tile-details.is-badged > span.board-tile-details-name")).click();
    }

    public void openMenuMore() {
        wd.findElement(By.cssSelector("span.icon-sm.icon-overflow-menu-horizontal.board-menu-navigation-item-link-icon")).click();
    }

    public void selectCloseBoard() {
        wd.findElement(By.cssSelector("a.board-menu-navigation-item-link.js-close-board")).click();
    }

    public void clickConfirmCloseButton() {
        wd.findElement(By.cssSelector("input.js-confirm.full.negate")).click();

    }

    public void returnToHomepage() {
        wd.findElement(By.cssSelector("span.header-btn-icon.icon-lg.icon-board-back-to-home.light")).click();
    }

    public void clickSpareSpace() {
        wd.findElement(By.cssSelector("div.boards-page-board-section-header")).click();
    }
}