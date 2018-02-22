package com.telRan.course;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase extends ApplicationManager {
    FirefoxDriver wd;

    public String url = "https://trello.com/";
    public String user = "dkuzinets@gmail.com";
    public String pwd = "TelRan17";


    @BeforeClass
    public void setUp() throws Exception {
        init();
    }

    public void init() {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        openSite(url);
        login(user, pwd);
    }

    @AfterClass
    public void tearDown() {
        stop();
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

    public void confirmLogin() {
        wd.findElement(By.id("login")).click();
    }


    public void login(String user, String pwd) {
        clickLoginButton();
        enterUserName(user);
        enterPassword(pwd);
        confirmLogin();
    }


    public void logout() {
        wd.findElement(By.cssSelector("img.member-avatar")).click();
        wd.findElement(By.cssSelector("a.js-logout")).click();
    }

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
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

    public void clickConfirmRenameButton() {
        wd.findElement(By.cssSelector("input.primary.wide.js-rename-board")).click();
    }

    public void findOpenBoard(String boardName) {
        wd.findElementByLinkText(boardName).click();
        //wd.findElement(By.cssSelector("div.chrome.chrome-64.windows.body-webkit-scrollbars.body-tabbed-page:nth-child(2) div.member-boards-view div.js-boards-page div.js-react-root div.boards-page-board-section.mod-no-sidebar:nth-child(1) ul.boards-page-board-section-list li.boards-page-board-section-list-item:nth-child(5) a.board-tile span.board-tile-details.is-badged > span.board-tile-details-name")).click();
    }

    public void clickBoardName() {
        wd.findElement(By.cssSelector("span.board-header-btn-text")).click();
    }

    public void renameB(String newBoardName) {
        wd.findElement(By.cssSelector("input.js-board-name.js-autofocus")).click();
        wd.findElement(By.cssSelector("input.js-board-name.js-autofocus")).clear();
        wd.findElement(By.cssSelector("input.js-board-name.js-autofocus")).sendKeys(newBoardName);
    }

    public void openMenu(){
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
}