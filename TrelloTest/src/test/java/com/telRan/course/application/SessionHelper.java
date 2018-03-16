package com.telRan.course.application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionHelper extends HelperBase{

    public SessionHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void login(String user, String pwd) {
        click(By.linkText("Log In"));
        type(By.id("user"), "dkuzinets@gmail.com");
        type(By.id("password"), "TelRan17");
        click(By.id("login"));
    }

    public void logout() {
        click(By.cssSelector("img.member-avatar"));
        click(By.cssSelector("a.js-logout"));
    }







}
