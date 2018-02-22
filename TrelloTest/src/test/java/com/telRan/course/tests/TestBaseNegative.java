package com.telRan.course.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBaseNegative {
    FirefoxDriver wd;

    public String user1 = "dkuzinets@gmail.com";
    public String pwd1 = "12345";
    public String user2 = "dkuzinets@gmail.com";
    public String pwd2 = "12345";

    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        openSite("https://trello.com/");
    }

    @AfterMethod
    public void tearDown() {
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


    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }


}