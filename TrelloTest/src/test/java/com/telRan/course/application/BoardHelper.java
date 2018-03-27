package com.telRan.course.application;

import com.telRan.course.model.BoardData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BoardHelper extends HelperBase {

    public BoardHelper(WebDriver wd) {
        super(wd);
    }

    public void findBoard(String boardName) {
        wd.findElement(By.linkText(boardName)).click();
    }

//    public void openBoardMoreMenu() {
//        wd.findElement(By.cssSelector("span.icon-sm.icon-overflow-menu-horizontal.board-menu-navigation-item-link-icon")).click();
//    }

    public void selectCloseBoard() {
        click(By.cssSelector("a.board-menu-navigation-item-link.js-close-board"));
    }

    public void clickConfirmCloseBoardButton() {
        click(By.cssSelector("input.js-confirm.full.negate"));
    }

    public void clickConfirmRenameBoardButton() {
        click(By.cssSelector("input.primary.wide.js-rename-board"));
    }

    public void clickBoardName() {
        click(By.cssSelector("span.board-header-btn-text"));
    }

    public void fillRenameBoardTitle(BoardData boardData) {
        type(By.cssSelector("input.js-board-name.js-autofocus"), boardData.getBoardName());
//        wd.findElement(By.cssSelector("input.js-board-name.js-autofocus")).click();
//        wd.findElement(By.cssSelector("input.js-board-name.js-autofocus")).clear();
//        wd.findElement(By.cssSelector("input.js-board-name.js-autofocus")).sendKeys(boardData.getBoardName());
    }

    public void openBoardMenu() {
        click(By.cssSelector("span.header-btn-icon.icon-lg.icon-add.light"));
    }

    public void selectCreateBoard() {
        click(By.cssSelector("span.sub-name"));
    }

    public void enterNewBoardName(BoardData boardData) {
        type(By.cssSelector("input.subtle-input"), boardData.getBoardName());
//        wd.findElement(By.cssSelector("input.subtle-input")).click();
//        wd.findElement(By.cssSelector("input.subtle-input")).clear();
//        wd.findElement(By.cssSelector("input.subtle-input")).sendKeys(boardData.getBoardName());
        click(By.cssSelector("button.primary"));
    }

    public void clickMoreMenuBoardButton() {
        click(By.cssSelector("a.board-menu-navigation-item-link.js-open-more"));
    }

    public void clickCreateBoardButton() {
        click(By.cssSelector("button.primary"));
    }

    public void clickBoardSpareSpace() {
        click(By.cssSelector("div.boards-page-board-section-header"));
    }

    public int getBoardCount() {
        return wd.findElements(By.cssSelector("span.board-tile-fade")).size();
    }
}
