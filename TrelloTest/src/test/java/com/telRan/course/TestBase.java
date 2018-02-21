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

    protected void clickLoginButton() {
        wd.findElement(By.linkText("Log In")).click();
    }


    protected void enterUserName(String userName) {
        wd.findElement(By.id("user")).click();
        wd.findElement(By.id("user")).clear();
        wd.findElement(By.id("user")).sendKeys(userName);
    }


    protected void enterPassword(String password) {
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys(password);
    }

    protected void confirmLogin() {
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


}