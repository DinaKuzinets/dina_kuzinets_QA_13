package com.telRan.course.application;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionHelper extends HelperBase{

    public SessionHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void login(String userName, String pwd) {
        click(By.linkText("Log In"));
        type(By.id("user"), userName);
        type(By.id("password"), pwd);
        click(By.id("login"));
    }

    public void logout() {
        click(By.cssSelector("img.member-avatar"));
        click(By.cssSelector("a.js-logout"));
    }







}
