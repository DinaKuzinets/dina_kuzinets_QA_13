package com.telRan.course.application;

import com.telRan.course.model.BoardData;
import com.telRan.course.model.ListData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    public String url = "https://trello.com/";
    public String user = "dkuzinets@gmail.com";
    public String pwd = "TelRan17";
    FirefoxDriver wd;

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void init() {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        openSite(url);
        login(user, pwd);
    }

    public void stop() {
        logout();
        wd.quit();
    }

    public void openSite(String url) {
        wd.get(url);
    }

    public void clickLoginButton() {
        wd.findElement(By.linkText("Log In")).click();
    }

    public void enterUserName(String userName) {
        wd.findElement(By.id("user")).click();
        wd.findElement(By.id("user")).clear();
        wd.findElement(By.id("user")).sendKeys(userName);
    }

    public void enterPassword(String password) {
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys(password);
    }

    public void clockConfirmLoginButton() {
        wd.findElement(By.id("login")).click();
    }

    public void login(String user, String pwd) {
        clickLoginButton();
        enterUserName(user);
        enterPassword(pwd);
        clockConfirmLoginButton();
    }

    public void logout() {
        wd.findElement(By.cssSelector("img.member-avatar")).click();
        wd.findElement(By.cssSelector("a.js-logout")).click();
    }

    public void findBoard(String boardName) {
        wd.findElementByLinkText(boardName).click();
        //   wd.findElement(By.cssSelector("div.chrome.chrome-64.windows.body-webkit-scrollbars.body-tabbed-page:nth-child(2) div.member-boards-view div.js-boards-page div.js-react-root div.boards-page-board-section.mod-no-sidebar:nth-child(1) ul.boards-page-board-section-list li.boards-page-board-section-list-item:nth-child(5) a.board-tile span.board-tile-details.is-badged > span.board-tile-details-name")).click();
    }

    public void openBoardMoreMenu() {
        wd.findElement(By.cssSelector("span.icon-sm.icon-overflow-menu-horizontal.board-menu-navigation-item-link-icon")).click();
    }

    public void selectCloseBoard() {
        wd.findElement(By.cssSelector("a.board-menu-navigation-item-link.js-close-board")).click();
    }

    public void clickConfirmCloseBoardButton() {
        wd.findElement(By.cssSelector("input.js-confirm.full.negate")).click();

    }

    public void clickConfirmRenameBoardButton() {
        wd.findElement(By.cssSelector("input.primary.wide.js-rename-board")).click();
    }

    public void clickBoardName() {
        wd.findElement(By.cssSelector("span.board-header-btn-text")).click();
    }

    public void fillRenameBoardTitle(BoardData boardData) {
        wd.findElement(By.cssSelector("input.js-board-name.js-autofocus")).click();
        wd.findElement(By.cssSelector("input.js-board-name.js-autofocus")).clear();
        wd.findElement(By.cssSelector("input.js-board-name.js-autofocus")).sendKeys(boardData.getNewBoardName());
    }

    public void openBoardMenu(){
    wd.findElement(By.cssSelector("span.header-btn-icon.icon-lg.icon-add.light")).click();
}

    public void selectCreateBoard() {
        wd.findElement(By.cssSelector("a.js-new-board")).click();
    }

    public void enterNewBoardName(String boardName) {
        wd.findElement(By.cssSelector("input.subtle-input")).sendKeys(boardName);
        wd.findElement(By.cssSelector("button.primary")).click();
    }

    public void returnToHomepage() {
        wd.findElement(By.cssSelector("span.header-btn-icon.icon-lg.icon-board-back-to-home.light")).click();
    }

    public void clickSpareSpace() {
        wd.findElement(By.cssSelector("div.boards-page-board-section-header")).click();
    }

    public void clickAddList() {
        wd.findElement(By.cssSelector("span.placeholder.js-open-add-list")).click();
    }

    public void enterNewListName(ListData listData) {
        wd.findElement(By.cssSelector("input.list-name-input")).click();
        wd.findElement(By.cssSelector("input.list-name-input")).clear();
        wd.findElement(By.cssSelector("input.list-name-input")).sendKeys(listData.getListName());
    }

    public void clickSaveListButton() {
        wd.findElement(By.cssSelector("input.primary.mod-list-add-button.js-save-edit")).click();
    }

    public void findList(String listName) {
        wd.findElementByLinkText(listName).click();
    }

    public void fillRenameListTitle(String newListName) {
        wd.findElement(By.cssSelector("div.chrome.chrome-64.windows.body-webkit-scrollbars.body-custom-board-background.body-dark-board-background.body-board-view:nth-child(2) div.board-wrapper div.board-main-content div.board-canvas div.u-fancy-scrollbar.js-no-higher-edits.js-list-sortable.ui-sortable div.js-list.list-wrapper:nth-child(2) div.list.js-list-content div.list-header.js-list-header.u-clearfix.is-menu-shown > div.list-header-target.js-editing-target")).click();
        wd.findElement(By.cssSelector("div.chrome.chrome-64.windows.body-webkit-scrollbars.body-custom-board-background.body-dark-board-background.body-board-view:nth-child(2) div.board-wrapper div.board-main-content div.board-canvas div.u-fancy-scrollbar.js-no-higher-edits.js-list-sortable.ui-sortable div.js-list.list-wrapper:nth-child(2) div.list.js-list-content div.list-header.js-list-header.u-clearfix.is-menu-shown > div.list-header-target.js-editing-target")).clear();
        wd.findElement(By.cssSelector("div.chrome.chrome-64.windows.body-webkit-scrollbars.body-custom-board-background.body-dark-board-background.body-board-view:nth-child(2) div.board-wrapper div.board-main-content div.board-canvas div.u-fancy-scrollbar.js-no-higher-edits.js-list-sortable.ui-sortable div.js-list.list-wrapper:nth-child(2) div.list.js-list-content div.list-header.js-list-header.u-clearfix.is-menu-shown > div.list-header-target.js-editing-target")).sendKeys(newListName);
    }
}
